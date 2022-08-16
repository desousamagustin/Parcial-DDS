import model.Usuario.Cuenta;
import model.Usuario.Usuario;
import model.apiCotizacion.Cotizacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;

public class InterfazDeUsuario {

    public void iniciarSesion(Usuario unUsuario, Cuenta unaCuenta) {
        unaCuenta.solicitarEmailYContrasenia();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        try {
            Cuenta cuentaBuscada = (Cuenta) entityManager.createQuery(
                            "FROM Cuenta u WHERE u.email LIKE :variableEmail AND u.contrasenia LIKE :variablePassword ")
                    .setParameter("variableEmail",unaCuenta.getEmail())
                    .setParameter("variablePassword",unaCuenta.getContrasenia()).getSingleResult();

            unUsuario = cuentaBuscada.getUsuarioAsociado();
            unaCuenta.setSesionIniciada(true);
        } catch (Exception e) {
            System.out.println("No existe el usuario");
        }

        entityManager.close();
        entityManagerFactory.close();
    }

    public void registrarse(Usuario unUsuario, Cuenta unaCuenta) {
        unaCuenta.solicitarEmailYContrasenia();

        unUsuario.solicitarDatos();
        unUsuario.setCuentaPersonal(unaCuenta);
        unaCuenta.setUsuarioAsociado(unUsuario);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(unUsuario);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

    public void comprarEntradas(Usuario unUsuario) {

    }

    public void buscarEvento(Usuario unUsuario) {

    }

    public void verDescuentosDisponibles(Usuario unUsuario) {

    }

    public void generarAvatarPersonalizado(Usuario unUsuario) {

    }

    public void comprarProducto(Usuario unUsuario) {

    }

    public void consultarCotizacionDolar() throws IOException {
        Cotizacion cotizacion = new Cotizacion();
        String resultado = cotizacion.obtenerCotizacion().toString();
        System.out.println(resultado);
    }
}

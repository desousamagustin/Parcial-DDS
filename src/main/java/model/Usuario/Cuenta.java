package model.Usuario;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Table(name = "cuenta")
public class Cuenta {
    @Column(name = "id_cuenta")
    @Id
    private int idCuenta;
    @Column
    private String email;
    @Column
    private String contrasenia;
    @Column(name = "fecha_de_creacion")
    private String fechaDeCreacion;


    public int getId_cuenta() {
        return idCuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.idCuenta = id_cuenta;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }


    private void solicitarEmailYContrasenia() {
        Scanner cadena = new Scanner(System.in);

        System.out.print("Ingrese su e-mail: ");
        email = cadena.nextLine();
        System.out.print("Ingrese su contrasenia: ");
        contrasenia = cadena.nextLine();
        System.out.print("Ingrese fecha de creacion: ");
        fechaDeCreacion = cadena.nextLine(); // Esto no debe pedirse por parametro. Tiene que ser automatico
    }

    public void iniciarSesion(Usuario unUsuario) {
        this.solicitarEmailYContrasenia();

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Cuenta cuentaBuscada = (Cuenta) entityManager.createQuery("FROM Cuenta WHERE email = 'agus.desousa99@gmail.com' AND contrasenia = '123456789'").getSingleResult();
        entityManager.getTransaction().commit();

        /*
        if(cuentaBuscada.getId_cuenta() != 0) {
            Usuario usuarioBuscado = (Usuario) entityManager.createQuery("FROM Usuario WHERE id_cuenta = 1");
            entityManager.getTransaction().commit();
            System.out.println("Usuario encontrado");
        } else
            System.out.println("Usuario no encontrado");*/

        entityManager.close();
        entityManagerFactory.close();
    }

    public void registrarse(Usuario nuevoUsuario) {
        this.solicitarEmailYContrasenia();
        int entrada;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id para cuenta: ");
        entrada = scanner.nextInt();
        this.idCuenta = entrada;
        nuevoUsuario.solicitarDatos();
        nuevoUsuario.setCuentaPersonal(this);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(nuevoUsuario);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
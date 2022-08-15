package model.Avatar;

import model.Usuario.Usuario;

import javax.persistence.*;
import java.util.Scanner;

@Entity
@Table(name = "avatar")
public class Humano extends Avatar {
    @Override
    public void solicitarDatos() {
        String cadena;
        int entero;
        Scanner cadenaIngresada = new Scanner(System.in);
        Scanner enteroIngresado = new Scanner(System.in);

        System.out.print("Color de ojos: ");
        cadena = cadenaIngresada.nextLine();
        this.setColorOjos(cadena);

        System.out.print("Camiseta de la seleccion: ");
        cadena = cadenaIngresada.nextLine();
        this.setCamisetaSeleccion(cadena);

        System.out.print("Numero de camiseta: ");
        entero = enteroIngresado.nextInt();
        this.setNumeroCamiseta(entero);

        System.out.print("Apodo en la camiseta: ");
        cadena = cadenaIngresada.nextLine();
        this.setApodoCamiseta(cadena);
    }
    public void crearAvatarDefault() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(this);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        entityManager.close();
    }

    public void generarAvatar(Usuario usuario) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("db");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Humano avatarGenerico = (Humano) entityManager.createQuery("FROM avatar WHERE id_avatar = '7' "); // Query que me traiga el primer elemento de la tabla
        Humano nuevoAvatar = avatarGenerico.clonar();

        nuevoAvatar.solicitarDatos();
        usuario.setAvatar(nuevoAvatar);

    }

    @Override
    public Avatar clonar() {
        // return objeto clonado
    }

    public Humano(int numeroCamiseta, String apodoCamiseta, String colorPelo, String colorOjos, String camisetaSeleccion) {
        super(numeroCamiseta, apodoCamiseta, colorPelo, colorOjos, camisetaSeleccion);
    }

    public String getColorOjos() {
        return colorOjos;
    }
    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getCamisetaSeleccion() {
        return camisetaSeleccion;
    }

    public void setCamisetaSeleccion(String camisetaSeleccion) {
        this.camisetaSeleccion = camisetaSeleccion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getApodoCamiseta() {
        return apodoCamiseta;
    }

    public void setApodoCamiseta(String apodoCamiseta) {
        this.apodoCamiseta = apodoCamiseta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorPelo() {
        return ColorPelo;
    }

    public void setColorPelo(String colorPelo) {
        ColorPelo = colorPelo;
    }
}

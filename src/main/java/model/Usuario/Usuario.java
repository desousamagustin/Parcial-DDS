package model.Usuario;

import model.Avatar.PrototypeAvatar;
import model.Entrada.Reserva;
import model.MetodoDePago.StrategyMetodoDePago;

import java.util.List;
import java.util.Scanner;

public class Usuario {
    private Persona datosPersonales = new Persona();
    private int idUsuario;
    private String nombreUsuario;
    private PrototypeAvatar avatar;
    private List <Reserva> reservas;
    private StrategyMetodoDePago metodoDePago;
    private Cuenta cuentaPersonal;


    public Persona getDatosPersonales() {
        return datosPersonales;
    }

    public String getNombreUsuario() { return nombreUsuario; }

    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public PrototypeAvatar getAvatar() {
        return avatar;
    }

    public void setAvatar(PrototypeAvatar avatar) {
        this.avatar = avatar;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public StrategyMetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(StrategyMetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void completarCampos(Cuenta unaCuenta) { // Acá se tiene que ir a la base de datos a buscar al usuario asociado a esa cuenta y agregar valores
        unaCuenta.completarConDatosDeBBDD(); // Creo que seria la query INSERT

        this.datosPersonales = unaCuenta.getUsuario().getDatosPersonales();
        this.idUsuario = unaCuenta.getUsuario().idUsuario;
        this.cuentaPersonal = unaCuenta;
        this.avatar = unaCuenta.getUsuario().avatar;
        this.reservas = unaCuenta.getUsuario().reservas;
        this.metodoDePago = unaCuenta.getUsuario().getMetodoDePago();
    }

    public void solicitarDatos() {
        String cadena;
        Scanner stringIngresado = new Scanner(System.in);
        int entero;
        Scanner enteroIngresado = new Scanner(System.in);

        System.out.print("Nombre: ");
        cadena = stringIngresado.nextLine();
        datosPersonales.setNombre(cadena);

        System.out.print("Apellido: ");
        cadena = stringIngresado.nextLine();
        datosPersonales.setApellido(cadena);

        System.out.print("DNI: ");
        cadena = stringIngresado.nextLine();
        datosPersonales.setDni(cadena);

        System.out.print("Edad: ");
        entero = enteroIngresado.nextInt();
        this.datosPersonales.setEdad(entero);

        System.out.println("Id Usuario: ");
        entero = enteroIngresado.nextInt();
        this.setIdUsuario(entero);

        System.out.print("Nombre de usuario: ");
        cadena = stringIngresado.nextLine();
        this.setNombreUsuario(cadena);

        this.reservas = null;
        this.avatar = null;
        this.metodoDePago = null;
    }
}
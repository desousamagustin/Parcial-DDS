package model.Usuario;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Scanner;

public class Cuenta {
    private int idCuenta;
    private String fechaCreacion;
    private String email;
    private String contrasenia;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private Usuario usuario;


    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    private void solicitarEmailYContrasenia() {
        Scanner emailIngresado = new Scanner(System.in);
        Scanner contraseniaIngresada = new Scanner(System.in);

        System.out.println("Ingrese su e-mail ");
        System.out.print("E-mail: ");
        email = emailIngresado.nextLine();
        System.out.println("Ingrese su contrasenia");
        System.out.print("Contrasenia: ");
        contrasenia = contraseniaIngresada.nextLine();
    }

    private Boolean existeCuenta() { // acá tiene que ir a verificar a la base de datos que exista la cuenta
        return true;
    }

    public void iniciarSesion(Usuario unUsuario,Boolean sePudoIniciarSesion) {

        this.solicitarEmailYContrasenia();

        if(this.existeCuenta()) {
            unUsuario.completarCampos(this);
            sePudoIniciarSesion = true;
        } else {
            System.out.println("E-mail y/o contrasenia incorrectos");
        }
    }

    public void completarConDatosDeBBDD() {

    }

    public void registrarse(Usuario nuevoUsuario) {
        this.solicitarEmailYContrasenia();
        nuevoUsuario.solicitarDatos();
        // this.registrarEnBBDD();
    }
}
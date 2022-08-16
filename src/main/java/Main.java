import model.Usuario.Cuenta;
import model.Usuario.Usuario;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        InterfazDeUsuario interfaz = new InterfazDeUsuario();
        int opcion;
        Scanner opcionElegida = new Scanner(System.in);
        Usuario usuario;
        Cuenta cuenta;

        //Humano humano = new Humano(0,"Default","Negro","Negro","Default");
        //humano.crearAvatarDefault();

        do {
            usuario = new Usuario();
            cuenta = new Cuenta();

            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");

            System.out.print("Opcion: ");
            opcion = opcionElegida.nextInt();

            if(opcion == 1) {
                interfaz.iniciarSesion(usuario,cuenta);
            } else
                interfaz.registrarse(usuario,cuenta);

        } while(opcion != 1 || !cuenta.sesionIniciadaCorrectamente());

        System.out.println("Bienvenido al sistema de reserva de entradas para el cine. Por favor, elija una de las siguientes opciones: ");

        do {
            System.out.println("0. Salir");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Buscar película o partido de fútbol recomendado");
            System.out.println("3. Ver descuentos disponibles");
            System.out.println("4. Generar un avatar personalizado");
            System.out.println("5. Comprar un combo");
            System.out.println("6. Consultar cotizacion del dolar blue");

            System.out.print("Opcion: ");
            opcion = opcionElegida.nextInt();

            switch (opcion) {
                case 1:
                    interfaz.comprarEntradas(usuario);
                    break;
                case 2:
                    interfaz.buscarEvento(usuario);
                    break;
                case 3:
                    interfaz.verDescuentosDisponibles(usuario);
                    break;
                case 4:
                    interfaz.generarAvatarPersonalizado(usuario);
                    break;
                case 5:
                    interfaz.comprarProducto(usuario);
                    break;
                case 6:
                    interfaz.consultarCotizacionDolar();
                default:
                    break;
            }
        } while (opcion != 0);
    }
}
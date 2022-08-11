import model.Usuario.Cuenta;
import model.Usuario.Usuario;
import org.springframework.boot.SpringApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SpringApplication.run(Main.class, args);

        int opcion;
        Scanner opcionElegida = new Scanner(System.in);
        Boolean sesionActiva = false;
        Usuario usuario = new Usuario();

        do {
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Registrarse");

            System.out.print("Opcion: ");
            opcion = opcionElegida.nextInt();
            Cuenta nuevaCuenta = new Cuenta();

            if(opcion == 1) {
                nuevaCuenta.iniciarSesion(usuario,sesionActiva);
            } else
                nuevaCuenta.registrarse(usuario);

        } while(opcion != 1 || !sesionActiva);

        System.out.println("Bienvenido al sistema para reserva de entradas para el cine. Por favor, elija una de las siguientes opciones: ");

        do {
            System.out.println("0. Salir");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Buscar película o partido de fútbol recomendado");
            System.out.println("3. Ver descuentos disponibles");
            System.out.println("4. Generar un avatar personalizado");
            System.out.println("5. Comprar un combo");
            System.out.println("6. Consultar cotizacion del dolar");

            System.out.print("Opcion: ");
            opcion = opcionElegida.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }
}
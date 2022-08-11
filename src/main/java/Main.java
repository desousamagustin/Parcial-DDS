
import model.Usuario.Cuenta;
import org.springframework.boot.SpringApplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        int opcion;
        Scanner opcionElegida = new Scanner(System.in);
        Boolean sesionActiva = false;

        System.out.println("Bienvenido al sistema para reserva de entradas para el cine. Por favor, elija una de las siguientes opciones: ");

        do {
            System.out.println("0. Salir");
            System.out.println("1. Crear una cuenta");
            System.out.println("2. Ver descuentos disponibles");
            System.out.println("3. Buscar película o partido de fútbol recomendado");
            System.out.println("4. Comprar entradas");
            System.out.println("5. Generar un avatar personalizado");
            System.out.println("6. Comprar un combo");
            System.out.println("7. Consultar cotizacion del dolar");

            System.out.print("Opcion: ");
            opcion = opcionElegida.nextInt();

            switch (opcion) {
                case 1:
                    Cuenta nuevaCuenta = new Cuenta();
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
                case 7:
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }

}

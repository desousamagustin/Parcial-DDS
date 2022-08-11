package model.Avatar;

import java.util.Scanner;

public class Humano extends PrototypeAvatar {
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

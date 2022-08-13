package model.Avatar;

import model.Usuario.Usuario;

import java.util.Scanner;

public abstract class PrototypeAvatar {
    protected int numeroCamiseta;
    protected String apodoCamiseta;
    protected int id;
    protected String ColorPelo;
    protected String colorOjos;
    protected String camisetaSeleccion;

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

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public abstract void solicitarDatos();
}
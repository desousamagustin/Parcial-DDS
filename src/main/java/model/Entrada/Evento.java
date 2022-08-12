package model.Entrada;

import org.springframework.core.SpringVersion;

import java.time.LocalDate;

public abstract class Evento {
    private int calificacion;

    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Evento(int calificacion, double precio) {
        this.calificacion = calificacion;
        this.precio = precio;
    }

    public Evento(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public boolean esInteresante(){
        return this.getCalificacion() >=8 && criterioEsInteresante();
    }

    public abstract boolean criterioEsInteresante();

}

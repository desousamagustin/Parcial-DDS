package model.Evento;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Evento {
    @Column
    private int calificacion;
    private Sala salaAsignada;
    private String fecha;
    private double precio;


    public Sala getSalaAsignada() {
        return salaAsignada;
    }

    public void setSalaAsignada(Sala salaAsignada) {
        this.salaAsignada = salaAsignada;
    }

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

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean esInteresante(){
        return this.getCalificacion() >=8 && criterioEsInteresante();
    }

    public abstract boolean criterioEsInteresante();
}

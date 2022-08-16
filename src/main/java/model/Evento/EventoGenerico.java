package model.Evento;

import javax.persistence.*;

public abstract class EventoGenerico {

    private Integer id_evento;

    //@OneToOne(cascade = CascadeType.PERSIST)
    //@PrimaryKeyJoinColumn
    private Pelicula id_pelicula;


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

    public EventoGenerico(int calificacion, double precio) {
        this.calificacion = calificacion;
        this.precio = precio;
    }

    public EventoGenerico(int calificacion) {
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

    public boolean esInteresante() {
        return this.getCalificacion() >= 8 && criterioEsInteresante();
    }

    public abstract boolean criterioEsInteresante();
}

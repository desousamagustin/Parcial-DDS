package model.Entrada;

import model.Descuento.DescuentoMenor;
import model.Usuario.Usuario;

import java.time.LocalDate;

public class Entrada {

    private Usuario usuario;

    private Evento evento;

    private double precio;

    public Entrada() {
    }

    private LocalDate fechaEvento;

    private double descuentoOtorgado;

    //Ese descuento siempre se da entonces se empieza por el...
    private DescuentoMenor descuento;

    public Void verificarDescuento(){
        this.descuento.calcularDescuento(this,this.usuario,this.evento);
        this.costo();
        return null;
    }

    public void costo() {
        this.setPrecio(this.getPrecio() - this.getDescuentoOtorgado());
    }

    public double getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(double descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public double getPrecio() {
        return precio;
    }

    public double setPrecio(double precio) {
        this.precio = precio;
        return precio;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }



}

package model.Evento;

import model.Descuento.DescuentoMenor;
import model.Usuario.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "entrada")
public class Entrada {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private int idEntrada;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    private Evento evento;
    @Column
    private double precio;
    @Column
    private String fechaEvento;
    @Transient
    private double descuentoOtorgado;
    @Transient
    private DescuentoMenor descuento;

    public DescuentoMenor getDescuento() {
        return descuento;
    }

    public void setDescuento(DescuentoMenor descuento) {
        this.descuento = descuento;
    }
    /*
    public Void verificarDescuento(){
        this.descuento.calcularDescuento(this,this.usuario,this.evento);
        return null;
    }*/

    //Aca cuando vengo de consultar por mi descuento, agarro mi descuento calculado y hago el costo real de la entrada
    public double costo() {
       return this.setPrecio(this.getPrecio() - this.getDescuentoOtorgado());
    }

    public double getDescuentoOtorgado() {
        return descuentoOtorgado;
    }

    public void setDescuentoOtorgado(double descuentoOtorgado) {
        this.descuentoOtorgado = descuentoOtorgado;
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

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public boolean verificarDisponibilidad(Sala sala){
        return sala.hayEspaciosDisponible();
    }

    public void asignarValores(Evento eventoElegido) {
        this.precio = eventoElegido.getPrecio();
        this.fechaEvento = eventoElegido.getFecha();
    }
}

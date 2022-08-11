package model.Entrada;

import model.Descuento.DescuentoMayor;
import model.Descuento.DescuentoMedio;
import model.Descuento.DescuentoMenor;
import model.Usuario.Usuario;

import java.time.LocalDate;

public class Entrada {

    //TODO nao se esqueca de instanciar!
    private Usuario usuario;

    private Evento evento;

    private Float precio;



    private DescuentoMayor descuentoMayor = new DescuentoMayor();

    private DescuentoMedio descuentoMedio = new DescuentoMedio();

    private DescuentoMenor descuentoMenor = new DescuentoMenor();


  /*  public Void verificarDescuento(){

        if(descuentoMayor.calcularDescuento(this)){
            this.

        } else if (descuentoMedio.calcularDescuento(this)) {

        } else if (descuentoMenor.calcularDescuento(this)) {

        }else{

        }
    }*/
}

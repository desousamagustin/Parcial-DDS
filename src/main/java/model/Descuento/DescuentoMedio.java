package model.Descuento;

import model.Entrada.Entrada;
import model.Entrada.Evento;
import model.Usuario.Usuario;

public class DescuentoMedio implements  Descuento{

    /*Descuento medio: si la edad de la persona es menor o igual a 18 años, la misma
     accede a un 50% de descuento, ya sea para películas como para partidos.*/
    @Override
    public void calcularDescuento(Entrada entrada, Usuario usuario, Evento evento) {
        if(!usuario.esMayorDeEdad()){
             entrada.setDescuentoOtorgado(entrada.getPrecio() * 0.5);
        }else{
            entrada.setDescuentoOtorgado(0);
        }
    }
}

package model.Descuento;

import model.Entrada.Entrada;
import model.Entrada.Evento;
import model.Usuario.Usuario;

public class DescuentoMayor implements  Descuento{

    @Override
    public void calcularDescuento(Entrada entrada, Usuario usuario, Evento evento) {
         if(!evento.esInteresante()){
             entrada.setDescuentoOtorgado(entrada.getPrecio()*0.75);
         }else{
             entrada.setDescuentoOtorgado(0);
         }
    }
}

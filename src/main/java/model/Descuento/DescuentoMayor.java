package model.Descuento;

import model.Entrada.Entrada;
import model.Entrada.Evento;
import model.Usuario.Usuario;

public class DescuentoMayor implements EstrategiaDescuento {
    @Override
    public void calcularDescuento(Entrada entrada, Usuario usuario) {
         if(!entrada.getEvento().esInteresante()){
             entrada.setDescuentoOtorgado(entrada.getPrecio()*0.75);
         }else{
             entrada.setDescuentoOtorgado(0);
         }
    }
}

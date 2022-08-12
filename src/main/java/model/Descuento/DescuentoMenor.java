package model.Descuento;

import model.Entrada.Entrada;
import model.Entrada.Evento;
import model.Usuario.Usuario;

public class DescuentoMenor  implements  Descuento{
    public void calcularDescuento(Entrada entrada, Usuario usuario, Evento evento) {
        entrada.setDescuentoOtorgado(entrada.getDescuentoOtorgado()*0.25);
    }
}

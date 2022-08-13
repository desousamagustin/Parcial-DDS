package model.Descuento;

import model.Entrada.Entrada;
import model.Entrada.Evento;
import model.Usuario.Usuario;

public class DescuentoMenor implements EstrategiaDescuento {
    @Override
    public void calcularDescuento(Entrada entrada, Usuario usuario) {
        entrada.setDescuentoOtorgado(entrada.getDescuentoOtorgado()*0.25);
    }
}

package model.Descuento;

import model.Evento.Entrada;
import model.Usuario.Usuario;

public class Descuento {
    private EstrategiaDescuento estrategia;

    public void setEstrategia(EstrategiaDescuento descuento) {
        estrategia = descuento;
    }
    public void determinarDescuento(Entrada entrada,Usuario usuario) {
        estrategia.calcularDescuento(entrada,usuario);
    }
}

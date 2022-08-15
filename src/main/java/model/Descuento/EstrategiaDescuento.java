package model.Descuento;

import model.Evento.Entrada;
import model.Usuario.Usuario;

public interface EstrategiaDescuento {
    void calcularDescuento(Entrada entrada, Usuario usuario);
}

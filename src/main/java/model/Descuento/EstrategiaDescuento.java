package model.Descuento;

import model.Entrada.Entrada;
import model.Entrada.Evento;
import model.Usuario.Usuario;

public interface EstrategiaDescuento {
    void calcularDescuento(Entrada entrada, Usuario usuario);
}

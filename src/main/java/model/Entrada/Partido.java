package model.Entrada;

public class Partido extends  Evento{

    private final Seleccion seleccionUno;
    private final Seleccion seleccionDos;

    public Partido(int calificacion, double precio, Seleccion seleccionUno, Seleccion seleccionDos) {
        super(calificacion, precio);
        this.seleccionUno = seleccionUno;
        this.seleccionDos = seleccionDos;
    }

    @Override
    public boolean criterioEsInteresante() {
        return (seleccionUno.contieneJugadorEstrella() || seleccionUno.esMuyCampeon() || seleccionDos.contieneJugadorEstrella() || seleccionDos.esMuyCampeon());
    }

}

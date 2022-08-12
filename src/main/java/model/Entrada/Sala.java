package model.Entrada;

public class Sala {

    private int id;

    private Integer espacioTotal;

    private Integer espacioDisponible=100;

    private Evento eventoAsignado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getEspacioTotal() {
        return espacioTotal;
    }

    public void setEspacioTotal(Integer espacioTotal) {
        this.espacioTotal = espacioTotal;
    }

    public Integer getEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(Integer espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    public Evento getEventoAsignado() {
        return eventoAsignado;
    }

    public void setEventoAsignado(Evento eventoAsignado) {
        this.eventoAsignado = eventoAsignado;
    }

    public boolean hayEspaciosDisponible() {
        return this.getEspacioDisponible() > 0;
    }
}

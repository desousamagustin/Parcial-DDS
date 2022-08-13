package model.Entrada;

import java.util.ArrayList;

public class Reserva {
    private int numeroReserva;

    private int numeroOperacion;

    private boolean estaPaga;

    private ArrayList<Entrada> entradas;

    private double costoTotal;

    public float calcularCostoTotal(){
        for (Entrada entrada : entradas) {
            this.costoTotal = Double.sum(this.getCostoTotal(), entrada.costo());
        }
        return 0;
    }

    public boolean verificarDisponibilidad(Sala sala){
        return sala.hayEspaciosDisponible();
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public int getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(int numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public boolean isEstaPaga() {
        return estaPaga;
    }

    public void setEstaPaga(boolean estaPaga) {
        this.estaPaga = estaPaga;
    }

    public ArrayList<Entrada> getEntrada() {
        return entradas;
    }

    public void setEntrada(ArrayList<Entrada> entrada) {
        this.entradas = entrada;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }
}

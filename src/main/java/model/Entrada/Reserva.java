package model.Entrada;

import java.util.ArrayList;

public class Reserva {

    private int numeroReserva;

    private int numeroOperacion;

    private boolean estaPaga;

    private ArrayList<Entrada> entradas;

    private double costoTotal;

    public double calcularCostoTotal(){
        for(int x=0; x<entradas.size();x++){
            //Actor actor = elenco.get(x);
            Entrada entrada=entradas.get(x);
            this.costoTotal= this.costoTotal + entrada.getPrecio(); // esta bien esa suma??
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

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
}

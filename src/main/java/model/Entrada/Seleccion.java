package model.Entrada;

import java.util.ArrayList;

public class Seleccion {

    private String nombrePais;

    private String continente;

    private Integer mundialesGanado;

    private ArrayList<String> jugadoresTitulares;

    public String getNombrePais() {
        return nombrePais;
    }

    public Seleccion(String nombrePais, String continente, Integer mundialesGanado, ArrayList<String> jugadoresTitulares) {
        this.nombrePais = nombrePais;
        this.continente = continente;
        this.mundialesGanado = mundialesGanado;
        this.jugadoresTitulares = jugadoresTitulares;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public ArrayList<String> getJugadoresTitulares() {
        return jugadoresTitulares;
    }

    public void setJugadoresTitulares(ArrayList<String> jugadoresTitulares) {
        this.jugadoresTitulares = jugadoresTitulares;
    }

    public Integer getMundialesGanado() {
        return mundialesGanado;
    }

    public void setMundialesGanado(Integer mundialesGanado) {
        this.mundialesGanado = mundialesGanado;
    }

    public boolean contieneJugadorEstrella(){
        return this.getJugadoresTitulares().contains("Lionel Messi");
    }

    public boolean esMuyCampeon(){
        return this.getMundialesGanado() >= 5;

    }
}

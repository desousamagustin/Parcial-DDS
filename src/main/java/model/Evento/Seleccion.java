package model.Evento;

import java.util.ArrayList;

public class Seleccion {

    private String nombrePais;

    private String continente;

    private Integer mundialesGanado;

    private ArrayList<Jugador> jugadoresTitulares;

    public String getNombrePais() {
        return nombrePais;
    }

    public Seleccion(String nombrePais, String continente, Integer mundialesGanado, ArrayList<Jugador> jugadoresTitulares) {
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

    public ArrayList<Jugador> getJugadoresTitulares() {
        return jugadoresTitulares;
    }

    public void setJugadoresTitulares(ArrayList<Jugador> jugadoresTitulares) {
        this.jugadoresTitulares = jugadoresTitulares;
    }

    public Integer getMundialesGanado() {
        return mundialesGanado;
    }

    public void setMundialesGanado(Integer mundialesGanado) {
        this.mundialesGanado = mundialesGanado;
    }

    public boolean contieneJugadorEstrella(){
        for(int x=0; x<jugadoresTitulares.size();x++){
            Jugador jugador = jugadoresTitulares.get(x);
            if(jugador.getNombre().contains("Lionel Messi")){
                return true;
            }
        }
        return false;
    }

    public boolean esMuyCampeon(){
        return this.getMundialesGanado() >= 5;

    }
}

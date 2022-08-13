package model.Entrada;

import java.util.ArrayList;

public class Pelicula extends Evento {
    private int calificacion;
    private String productora;
    private ArrayList<Actor> elenco;
    private int minutosPelicula;

    public Pelicula(int calificacion, int calificacion1, String productora, ArrayList<Actor> elenco, int minutosPelicula, double precio) {
        super(calificacion,precio);
        this.calificacion = calificacion1;
        this.productora = productora;
        this.elenco = elenco;
        this.minutosPelicula = minutosPelicula;
    }

    public Pelicula(int calificacion, String productora, ArrayList<Actor> elenco, int minutosPelicula) {
        super(calificacion);
        this.productora = productora;
        this.elenco = elenco;
        this.minutosPelicula = minutosPelicula;
    }

    public int getMinutosPelicula() {
        return minutosPelicula;
    }

    public void setMinutosPelicula(int minutosPelicula) {
        this.minutosPelicula = minutosPelicula;
    }

    public ArrayList<Actor> getElenco() {
        return elenco;
    }

    public void setElenco(ArrayList<Actor> elenco) {
        this.elenco = elenco;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean criterioEsInteresante() {
        return this.productoraEsFamosa() || (tieneActoreEstrella() && this.tieneMuchosMinutos()) ;
    }

    public boolean productoraEsFamosa(){
        return this.getProductora().equals("Marvel");
    }

    public boolean tieneMuchosMinutos(){
        return this.getMinutosPelicula() >=200 && this.getMinutosPelicula()<=240;
    }

    public boolean tieneActoreEstrella(){
        for(int x=0; x<elenco.size();x++){
            Actor actor = elenco.get(x);
            if(actor.getNombre().contains("Dwayne Johnson") || actor.getNombre().contains("Vin Diesel")){
                return true;
            }
        }
        return false;
    }
}

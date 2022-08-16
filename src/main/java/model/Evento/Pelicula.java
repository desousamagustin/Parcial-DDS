package model.Evento;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity(name = "peliculas")
@PrimaryKeyJoinColumn(referencedColumnName = "id_pelicula")
public class Pelicula extends Evento {

    @Column
    private String productora;
    @OneToMany(mappedBy = "pelicula")
    private List<Actor> elenco;

    @Column
    private int minutosPelicula;

    public Pelicula(int calificacion, int calificacion1, String productora, List<Actor> elenco, int minutosPelicula, double precio) {
        super(calificacion,precio);
        this.productora = productora;
        this.elenco = elenco;
        this.minutosPelicula = minutosPelicula;
    }

    public Pelicula(int calificacion, String productora, List<Actor> elenco, int minutosPelicula) {
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

    public List<Actor> getElenco() {
        return elenco;
    }

    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
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

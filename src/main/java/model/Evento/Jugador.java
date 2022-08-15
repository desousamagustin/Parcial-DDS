package model.Evento;

public class Jugador {

    private int id;

    private String nombre;

    public int getId() {
        return id;
    }

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

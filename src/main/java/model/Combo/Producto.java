package model.Combo;

public abstract class Producto {
    protected String tamanio;
    protected Float precio;

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public abstract void calcularPrecio();

    public abstract void completarInformacion();
}

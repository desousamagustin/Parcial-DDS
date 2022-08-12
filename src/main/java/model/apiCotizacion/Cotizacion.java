package model.apiCotizacion;

import java.io.IOException;

public class Cotizacion {

    private int id;
    private String fecha;

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    private String compra;
    private String venta;

    private APICotizacion apiCotizacion = APICotizacion.getInstance();

    public int getId() {
        return id;
    }

    public Cotizacion(){ }

    public Cotizacion(int id, String fecha, String compra, String venta){
        this.id = id;
        this.fecha = fecha;
        this.compra = compra;
        this.venta = venta;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCompra(){
        System.out.println(" compra seteada:" + this.compra);
        return compra;
    }

    public double getVenta(){
        return Double.parseDouble(venta);
    }

    public String toString(){
        return "Cotizacion dolar blue\n\n" + "Fecha: "+this.fecha+"\nDolar venta: "+this.venta
                +"\tDolar compra: "+this.compra +"\n\n"+" el valor del DOLAR en la cual debes tomar para CONVERSION es: "+this.compra;
    }

    public Cotizacion obtenerCotizacion() throws IOException {
        return apiCotizacion.getCotizacion();
    }
}

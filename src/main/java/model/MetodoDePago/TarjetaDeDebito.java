package model.MetodoDePago;

public class TarjetaDeDebito implements MetodoDePago{

    private Integer numeroTarjeta;

    private String titular;

    private float dineroDisponible;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(float dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public TarjetaDeDebito(Integer numeroTarjeta, String titular, float dineroDisponible) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.dineroDisponible = dineroDisponible;
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(float montoAPagar) throws InsuficienteMontoExcepction {

        if(tengoDineroSuficiente(montoAPagar)){
            this.dineroDisponible = this.dineroDisponible - montoAPagar;
        }else{
            throw new InsuficienteMontoExcepction();
        }
    }

    public boolean tengoDineroSuficiente(float montoAPagar){
        return this.getDineroDisponible()>=montoAPagar;   // 20 >=10
    }
}

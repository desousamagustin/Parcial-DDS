package model.MetodoDePago;

public class InsuficienteMontoExcepction extends Exception{

    public InsuficienteMontoExcepction (){
        super("Desculpe! Monto insuficente para operar :( .");
    }
}

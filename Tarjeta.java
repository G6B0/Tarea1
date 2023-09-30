class Tarjeta extends Pago{
    private String Tipo;
    private int plazos;
    private String numTransaccion;
    public Tarjeta(String tipo1, String numTran1, float monto1, String fecha1){
        super(monto1, fecha1);
        this.Tipo=tipo1;
        this.numTransaccion=numTran1;
    }
}
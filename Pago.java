class Pago{
    private float monto;
    private String fecha;
    public Pago(float monto1, String fecha1){
        this.monto=monto1;
        this.fecha=fecha1;
    }
    public float getMonto() {
        return monto;
    }
    public String getFecha() {
        return fecha;
    }
}
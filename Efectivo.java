class Efectivo extends Pago{
private OrdenCompra orden;
    public Efectivo(float monto1, String fecha1) {
        super(monto1, fecha1);
    }
    public float calDevolcion(){
        return super.getMonto()-orden.;
    }

}
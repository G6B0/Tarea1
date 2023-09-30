import java.time.LocalDate;

class Efectivo extends Pago{
private OrdenCompra orden;
    public Efectivo(float monto1, LocalDate fecha1) {
        super(monto1, fecha1);
    }
    public float calDevolcion(){
        return super.getMonto()-orden.calcPrecio();
    }

}
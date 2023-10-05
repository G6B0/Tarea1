import java.time.LocalDate;

class Efectivo extends Pago {
    private float monto;
    private OrdenCompra ordenasociada;
    public Efectivo(float monto, LocalDate fecha, OrdenCompra orden) {
        super();
        this.monto=monto;
        this.ordenasociada=orden;
    }
    public float calcularDevolucion() {
        if (monto >= ordenasociada.calcPrecio()) {
            return monto - ordenasociada.calcPrecio();
        } else {
            return monto;
        }
    }
}

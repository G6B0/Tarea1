import java.time.LocalDate;
abstract class Pago{
    private float Monto;
    private LocalDate FechaDePago;
    private OrdenCompra OrdenAsociada;
    public Pago(LocalDate fecha, OrdenCompra orden){
        this.Monto = orden.calcPrecio();
        this.FechaDePago=fecha;
        this.OrdenAsociada=orden;
    }
    public float getMonto() {
        return Monto;
    }
    public LocalDate getFecha() {
        return FechaDePago;
    }
}
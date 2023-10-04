import java.time.LocalDate;

class Efectivo extends Pago {
    private float pagado;

    public Efectivo(float cuanto, LocalDate fecha, OrdenCompra orden) {
        super(fecha, orden);
        this.pagado = cuanto;
    }

    public float calcularDevolucion() {
        if (pagado >= super.getMonto()) {
            return pagado - super.getMonto();
        } else {
            return pagado;
        }
    }
}

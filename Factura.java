import java.time.LocalDate;

public class Factura extends DocTributario {
    private String NumeroFactura;
    private int Plazos;
    private Pago MedioPago;
    public Factura(Cliente cliente, String numero, LocalDate fecha, OrdenCompra orden) {
        super(cliente, fecha,orden);
        this.NumeroFactura=numero;
    }
}
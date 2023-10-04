import java.time.LocalDate;

public class Boleta extends DocTributario {
    OrdenCompra Orden;
    private String NumeroBoleta;
    private Pago MedioPago;
    private int Plazos;
    public Boleta(Cliente cliente, String numero, LocalDate fecha, OrdenCompra orden) {
        super(cliente,fecha,orden);
    }

}

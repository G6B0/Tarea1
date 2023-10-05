import java.time.LocalDate;

public class Factura extends DocTributario {
    public Factura(Cliente cliente, LocalDate fecha) {
        super(cliente, fecha);
    }
    @Override
    public String toString() {
        return "Factura"+" "+super.toString();
    }
}
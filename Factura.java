import java.time.LocalDate;

public class Factura extends DocTributario {
    public Factura(String rut, String numero, LocalDate fecha) {
        super(rut, numero, fecha);
    }
}
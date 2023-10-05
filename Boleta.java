import java.time.LocalDate;

public class Boleta extends DocTributario {

    public Boleta(Cliente cliente, LocalDate fecha) {
        super(cliente,fecha);
    }
}

import java.time.LocalDate;

/**Es una clase basica que genera una referencia de factura*/
public class Factura extends DocTributario {
    /**El constructor un cliente para asociar la direccion y otros datos
     * ademas de la fecha que idialmente la entrega la orden asociada
     * @param cliente
     * @param fecha */
    public Factura(Cliente cliente, LocalDate fecha) {
        super(cliente, fecha);
    }
    /**toString de esta clase
     * @return la factura y lo demas atributos de la superclase*/
    @Override
    public String toString() {
        return "Factura: "+super.toString();
    }
}
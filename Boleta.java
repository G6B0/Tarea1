import java.time.LocalDate;
/**Clase heredara Tipo de documento tributario*/
public class Boleta extends DocTributario {
    /**El constructor inicializa la super clase
     * @param cliente
     * @param fecha
     */
    public Boleta(Cliente cliente, LocalDate fecha) {
        super(cliente,fecha);
    }
    /**toString para mostrar informacion actualiza asociada
     *@return boleta mas el to string de la superclase*/
    @Override
    public String toString() {
        return "Boleta: "+super.toString();
    }
}

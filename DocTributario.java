import java.time.LocalDate;
/**La clase sirve de plantilla e importa la informacion necesaria para boleta y factura*/
public class DocTributario {
    /**Direccion del cliente*/
    private Direccion direccion;
    /**Rut del cliente*/
    private String rut;
    /**Fecha actualizada de la orden*/
    private LocalDate fecha;
    /**El constructor recibe la fecha actual de la orden con su gette
     * r y el cliente asociado a la orden rellenando informacion solicitada
     * @param fecha
     * @param cliente
     */
    public DocTributario(Cliente cliente, LocalDate fecha){
        this.rut=cliente.getRut();
        this.direccion = new Direccion(cliente.getDireccionCliente());
        this.fecha=fecha;
    }
    /**toString para informacion de cliente
     *@return string de informacion
     */
    @Override
    public String toString() {
        return "Rut: "+rut+", "+"Direccion: "+direccion+", "+"Fecha: "+fecha;
    }
}
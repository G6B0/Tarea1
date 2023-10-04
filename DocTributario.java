import java.time.LocalDate;

    public class DocTributario {
        private Direccion Direccion;
    private String Rut;
    private LocalDate Fecha;
    private OrdenCompra OrdenDeCompra;
public DocTributario(Cliente cliente, LocalDate fecha,OrdenCompra orden){
    this.OrdenDeCompra=orden;
    this.Rut=cliente.getRut();
    this.Direccion = new Direccion(cliente.getDireccionCliente());
    this.Fecha=orden.getFecha();
 }

}

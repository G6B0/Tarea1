import java.time.LocalDate;
public class DocTributario {
    private Direccion direccion;
    private String rut;
    private LocalDate fecha;
    private OrdenCompra ordenDeCompra;
    public DocTributario(Cliente cliente, LocalDate fecha){
        this.ordenDeCompra=new OrdenCompra(cliente,fecha,this);
        this.rut=cliente.getRut();
        this.direccion = new Direccion(cliente.getDireccionCliente());
        this.fecha=ordenDeCompra.getFecha();
    }

    @Override
    public String toString() {
        return "Rut:"+rut+" "+"Direccion:"+direccion+" "+"Fecha: "+fecha+" "+"Orden de compra:"+ordenDeCompra;
    }
}

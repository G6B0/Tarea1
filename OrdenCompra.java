import java.time.LocalDate;
public class OrdenCompra {
    private LocalDate Fecha;
    private String Estado;
    private ListaDetalles detallesOrdenes;
    private Cliente usuario;
    private int Cantidad;
    public OrdenCompra(Cliente usuario, LocalDate fecha, Articulo art1, int cantidad){
        detallesOrdenes= new ListaDetalles();
       detallesOrdenes.agregarOrden(new DetalleOrden(cantidad,art1));
        this.usuario=usuario;
        Estado="falta pago";
        Fecha=fecha;

    }

    public String getEstado() {
        return Estado;
    }

    public LocalDate getFecha() {
        return Fecha;
    }
}

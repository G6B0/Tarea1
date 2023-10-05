import java.time.LocalDate;
import java.util.ArrayList;
public class OrdenCompra {
    private LocalDate fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private Cliente cliente;
    private float sumaTotal;
    private float pesoTotal;
    private DocTributario documentoTributario;
    private Pago medioDePago;
    public OrdenCompra(Cliente cliente, LocalDate fecha, DocTributario documento){
        this.sumaTotal =0;
        this.pesoTotal =0;
        this.cliente=cliente;
        if(this.sumaTotal ==0){
            this.estado="Pagado";
            this.documentoTributario=documento;
        }else{
            this.estado="No pagado";
            this.documentoTributario=null;
        }
        this.fecha = fecha;
        this.detalles = new ArrayList<>();
    }
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    public float calcPrecioSinIva(){
        return sumaTotal;
    }
    public float calcIva(){
        return sumaTotal *0.19f;
    }
    public float calcPeso(){
        return pesoTotal;
    }
    public String getEstado() {
        return estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void agregarDetalle(DetalleOrden detalle) {
        detalles.add(detalle);
        this.sumaTotal += detalle.calcPrecioSinIva();
        this.pesoTotal += detalle.calcPeso();
    }
    public void agregarPlazo(float monto, LocalDate fecha){
        this.fecha=fecha;
        this.sumaTotal -=monto;
    }
}


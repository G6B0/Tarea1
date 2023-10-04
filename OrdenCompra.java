import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenCompra {
    private LocalDate Fecha;
    private String Estado;
    private ArrayList<DetalleOrden> Detalles;
    private Cliente Usuario;
    private float SumaTotal;
    private float PesoTotal;
    private DocTributario DocumentoTributario;
    private Pago MedioPago;
    public OrdenCompra(Cliente usuario, LocalDate fecha){
        this.SumaTotal=0;
        this.PesoTotal=0;
        this.Usuario=usuario;
        this.Estado="falta pago";
        this.Fecha=fecha;
        this.Detalles = new ArrayList<>();
    }
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    public float calcPrecioSinIva(){
        return SumaTotal;
    }
    public float calcIva(){
        return SumaTotal*0.19f;
    }
    public float calcPeso(){
        return PesoTotal;
    }
    public String getEstado() {
        return Estado;
    }

    public LocalDate getFecha() {
        return Fecha;
    }
    public void agregarDetalle(DetalleOrden detalle) {
        Detalles.add(detalle);
        this.SumaTotal += detalle.calcPrecioSinIva();
        this.PesoTotal += detalle.calcPeso();
    }


}

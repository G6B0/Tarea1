import java.time.LocalDate;
public class OrdenCompra {
    private LocalDate Fecha;
    private String Estado;
    private ListaDetalles Detalles;
    private Cliente Usuario;
    private float SumaTotal;
    private float PesoTotal;
    public OrdenCompra(Cliente usuario, LocalDate fecha, Articulo articulo, int cantidad){
        this.SumaTotal=0;
        this.PesoTotal=0;
        this.Usuario=usuario;
        Estado="falta pago";
        Fecha=fecha;
        Detalles= new ListaDetalles();
        Detalles.agregarOrden(new DetalleOrden(cantidad,articulo));
        while (true) {
             DetalleOrden detalleX = Detalles.devolverOrden();
            if (detalleX != null) {
                this.SumaTotal += detalleX.calcPrecioSinIva();
                this.PesoTotal += detalleX.calcPeso();
            } else {
                break;
            }
        }
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
}

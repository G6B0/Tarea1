import java.util.ArrayList;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    private ArrayList<Articulo> ListaArticulos;
    public DetalleOrden(int cantidad, Articulo articulo){
        this.ListaArticulos=new ArrayList<>();
        for(int i=1;i<=cantidad;i++){
            ListaArticulos.add(articulo);
        }
        this.cantidad=cantidad;
        this.articulo=articulo;
    }
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    public float calcPrecioSinIva(){
        return articulo.getPrecio()*cantidad;
    }
    public float calcIva(){
        return calcPrecioSinIva()*0.19f;
    }
    public float calcPeso(){
        return articulo.getPeso()*cantidad;
    }
}

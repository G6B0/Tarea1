import java.util.ArrayList;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(){
    }
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    public float calcPrecioSinIva(){
        return 0;
    }
    public float calcIva(){
        return calcPrecioSinIva()*0.19f;
    }
    public float calcPeso(){
        return 0;
    }
}

import java.util.ArrayList;

public class ListaDetalles {
    private ArrayList<DetalleOrden> Detalles;
    public ListaDetalles(){
        this.Detalles=new ArrayList<>();
    }
    public void agregarOrden(DetalleOrden orden1){
        Detalles.add(orden1);
    }
    public DetalleOrden devolverOrden(){
        if(Detalles.size()==0){
            return null;
        }else{
            return Detalles.remove(0);
        }
    }
}

import java.util.ArrayList;

public class ListaDetalles {
    private ArrayList<DetalleOrden> Ordenes;
    public ListaDetalles(){
        this.Ordenes=new ArrayList<>();
    }
    public void agregarOrden(DetalleOrden orden1){
        Ordenes.add(orden1);
    }
    public DetalleOrden devolverOrden(){
        if(Ordenes.size()==0){
            return null;
        }else{
            return Ordenes.remove(0);
        }
    }
}

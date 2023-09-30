import java.util.ArrayList;
public class ListaArticulos {
    private ArrayList<Articulo> listaArticulos;
    public ListaArticulos(){
        this.listaArticulos=new ArrayList<>();
    }
    public void agregar(Articulo art1){
        listaArticulos.add(art1);
    }
}

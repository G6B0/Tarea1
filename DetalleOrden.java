import java.util.ArrayList;
/**Clase que sirve de composicion para Ordencompra*/
public class DetalleOrden {
    /**Cantidad de articulos*/
    private int cantidad;
    /**Articulo que se agrega*/
    private Articulo articulo;
    /**Clase arraylist para agregar articulos*/
    private ArrayList<Articulo> listaDeArticulos;
    /**El constructor inicializa la lista de articulos y agrega la cantidad del articulo
     * pasado por parametro y ademas el articulo para poder calcular con sus metodos el precio y peso
     * @param articulo
     * @param cantidad
     */
    public DetalleOrden(int cantidad, Articulo articulo){
        this.listaDeArticulos=new ArrayList<>();
        for(int i=1;i<=cantidad;i++){
            listaDeArticulos.add(articulo);
        }
        this.cantidad=cantidad;
        this.articulo=articulo;
    }
    /**Calcula el precio con IVA de los articulos mediante el llamado a sus otros metodos
     * return Suma precio total mas IVA
     */
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    /**Calcula el preciototal sin IVA de todos los articulos agregados
     * return precio*cantidad
     */
    public float calcPrecioSinIva(){
        return articulo.getPrecio()*cantidad;
    }
    /**Calcula solamente el IVA del precio de todos los articulos agregados
     *@return preciototal*0.19
     */
    public float calcIva(){
        return calcPrecioSinIva()*0.19f;
    }
    /**Calcula el peso total de los articulos agregados
     *@return peso del articulo por cantidad*/
    public float calcPeso(){
        return articulo.getPeso()*cantidad;
    }
    /**toString para la cantidad del articulo con el nombre
     * @return String de informacion de detalle*/
    @Override
    public String toString() {
        return "Cantidad del articulo: "+cantidad +", "+"Nombre: "+ articulo.getNombre();
    }
}

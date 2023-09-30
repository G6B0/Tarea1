public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    private ListaArticulos lista;
    private float precioTotal;
    public DetalleOrden(int cantidad,Articulo articulo){
        this.precioTotal=0;
        this.lista=new ListaArticulos();
        for(int i=1;i<=cantidad;i++){
            lista.agregar(articulo);
            precioTotal+=articulo.getPrecio();
        }
        this.cantidad=cantidad;
        this.articulo=articulo;
    }
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    public float calcPrecioSinIva(){
        return precioTotal;
    }
    public float calcIva(){
        return precioTotal*0.19f;
    }
    public float calcPeso(){
        return articulo.getPeso()*cantidad;
    }
}

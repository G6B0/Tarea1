
/**Clase que crea nuevos articulos con precio y sus caracteristicas*/
public class Articulo {
    /**Peso del articulo*/
    private float peso;
    /**Nombre del articulo*/
    private String nombre;
    /**Descripcion del articulo*/
    private String descripcion;
    /**Precio del articulo*/
    private float precio;
    /**El constructor inicializa los atributos de articulo
     * @param descripcion
     * @param nombre
     * @param peso
     * @param precio
     */
    public Articulo(float peso, String nombre, String descripcion, float precio){
        this.peso=peso;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
    }

    /**Getter a peso del articulo
     *@return peso
     */
    public float getPeso() {
        return peso;
    }

    /**Getter a nombre del articulo
     *@return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**Getter a descripcion del articulo
     *@return descripcion*/
    public String getDescripcion() {
        return descripcion;
    }
    /**Getter a precio del articulo
     *@return precio
     */
    public float getPrecio() {
        return precio;
    }
    /**toString para toda la informacion del articulo
     * return String detallado*/
    @Override
    public String toString() {
        return "Peso: "+peso+", "+"Nombre: "+nombre+", "+"Descripcion: "+descripcion+", "+"Precio: "+precio;
    }
}
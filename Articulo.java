public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;

    public Articulo(float peso,String nombre,String descripcion,float precio){
        this.peso=peso;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;

    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "peso:"+peso+" nombre:"+nombre+" descripcion: "+descripcion+" precio: "+precio;
    }
}

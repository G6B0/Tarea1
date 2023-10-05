import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccionCliente;
    private ArrayList<OrdenCompra> pedido;
    public Cliente(String nombre,String rut, Direccion direccionCliente){
        this.pedido=new ArrayList<>();
        this.nombre=nombre;
        this.rut=rut;
        this.direccionCliente=direccionCliente;
    }
    public void AgregarOrden(OrdenCompra orden){
        pedido.add(orden);
    }
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public String getDireccionCliente(){
        return direccionCliente.getDireccion();
    }
}

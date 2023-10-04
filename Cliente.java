import java.util.ArrayList;
public class Cliente {
    private String Nombre;
    private String Rut;
    private Direccion DireccionCliente;
    private ArrayList<OrdenCompra> Compras;
    public Cliente(String nombre,String rut, Direccion direccion){
        this.Compras=new ArrayList<>();
        this.Nombre=nombre;
        this.Rut=rut;
        this.DireccionCliente=direccion;
    }
 public void AgregarOrden(OrdenCompra ordenx){
     Compras.add(ordenx);
 }

    public String getNombre() {
        return Nombre;
    }

    public String getRut() {
        return Rut;
    }
    public String getDireccionCliente(){
        return DireccionCliente.getDireccion();
    }

}

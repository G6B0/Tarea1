import java.util.ArrayList;
/**Clase principalmente para iniciar cliente con su respectiva información y aregar sus ordenes*/
public class Cliente {
    /**Nombre del cliente
     */
    private String nombre;
    /**Rut del cliente
     */
    private String rut;
    /**Direccion del cliente
     */
    private Direccion direccionCliente;
    /**Pedido tipo arraylist asociado al cliente, consta de 0 o mas ordenes
     */
    private ArrayList<OrdenCompra> pedido;
    /**El constructor inicializa el nombre, rut, direccion con su respectiva clase, ademas del pedido
     * @param nombre
     * @param rut
     * @param direccionCliente
     */
    public Cliente(String nombre,String rut, Direccion direccionCliente){
        this.pedido=new ArrayList<>();
        this.nombre=nombre;
        this.rut=rut;
        this.direccionCliente=direccionCliente;
    }
    /**Agrega una orden al pedido arraylist
     * @param orden */
    public void AgregarOrden(OrdenCompra orden){
        pedido.add(orden);
    }
    /**Getter a nombre del cliente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**Getter a rut del cliente
     * @return rut
     */
    public String getRut() {
        return rut;
    }
    /**Getter al metodo de direccion para hacer la clase solicitada
     * @return
     */
    public String getDireccionCliente(){
        return direccionCliente.toString();
    }
    /**toString principalmente para la informacion del cliente
     * @return  atributos cliente
     */
    @Override
    public String toString() {
        return "Nombre: "+nombre+", "+"Rut: "+rut+", "+"Direccion del Cliente: "+direccionCliente;
    }
}

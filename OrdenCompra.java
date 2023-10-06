import java.time.LocalDate;
import java.util.ArrayList;
/**Esta clase gestiona los precios y pesos totales de todos los detalles que se agregan a esta misma
 * ademas de generar boleta o factura cuando tenga pagado el monto total*/
public class OrdenCompra {
    private LocalDate fecha;
    /**Fecha inicial de la orden*/
    private String estado;
    /**Arraylist para gestionar los detalles*/
    private ArrayList<DetalleOrden> detalles;
    /**Cliente asociado a la orden*/
    private Cliente cliente;
    /**Atributo para calcular el precio total*/
    private float sumaTotal;
    /**Atributo para calcular el peso total*/
    private float pesoTotal;
    private DocTributario documentoTributario;
    /**En el constructor se inicializa la suma y el total en 0 para sumar todos los totales, ademas
     * se asocia el cliente, define el estado de la compra y genera su respectivo documento tributario
     * y la fecha inicial
     * @param fecha
     * @param cliente
     * @param documento
     */
    public OrdenCompra(Cliente cliente, LocalDate fecha, DocTributario documento){
        this.sumaTotal = 0;
        this.pesoTotal = 0;
        this.cliente = cliente;
        this.documentoTributario=documento;
        this.fecha = fecha;
        this.detalles = new ArrayList<>();
        actualizarEstado();
    }
    /**Calcula la suma actualizada incluido el IVA*/
    public float calcPrecio(){
        return calcPrecioSinIva()+calcIva();
    }
    /**Devuelve la suma total actualizada
     *@return la sumatotal
     */
    public float calcPrecioSinIva(){
        return sumaTotal;
    }
    /**Calcula el IVA total de la orden
     * @return sumatotal*0.19
     */
    public float calcIva(){
        return calcPrecioSinIva() *0.19f;
    }
    /**Mostrar el peso actualizado total de la orden
     * @return peso total
     */
    public float calcPeso(){
        return pesoTotal;
    }
    /**Mostrar estado actual de la orden
     * @return estado
     */
    public String getEstado() {
        return estado;
    }
    /**Mostrar fecha actualizada de la orden
     * @return fechaf
     */
    public LocalDate getFecha() {
        return fecha;
    }
    /**Agrega los detalles al arraylist de detalles sumando los precios y los pesos mediante sus metodos
     * @param detalle
     */
    public void agregarDetalle(DetalleOrden detalle) {
        detalles.add(detalle);
        this.sumaTotal += detalle.calcPrecioSinIva();
        this.pesoTotal += detalle.calcPeso();
        actualizarEstado();
    }
    /**Recibe los parametros de los pagos y fechas corrrespondientes de tarjeta/transferencia
     * y los actualiza, ademas añade logica por si el monto del medio de pago es mayor al total
     * @param fecha
     * @param monto
     */
    public void agregarPlazo(float monto, LocalDate fecha) {
        float montoTotalConIVA = calcPrecio();

        if (monto <= montoTotalConIVA) {
            montoTotalConIVA -= monto;
            this.sumaTotal = montoTotalConIVA / 1.19f;
            actualizarEstado();
        } else {
            System.out.println("El monto a pagar excede el total de la orden.");
        }
        this.fecha = fecha;
    }

    /**toString de esta clase
     * @return la fecha, estado actualizado y el nombre asociado a la orden
     */

    @Override
    public String toString() {
        return "Fecha actual: "+fecha+", "+"Estado del pago: "+estado+", "+"Cliente: "+cliente.getNombre()+", "+"Monto a pagar: "+calcPrecio();
    }
    /**Este metodo actualiza el estado de la orden*/
    private void actualizarEstado() {
        if (this.sumaTotal == 0) {
            this.estado = "Pagado";
        } else {
            this.estado = "No pagado";
        }
    }
}


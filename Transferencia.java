import java.time.LocalDate;
/**La idea de esta clase es que se instancia una sola vez asociada a un cliente
 * para tener la logica de que la cuenta sea unica y pagar muchas veces solo con metodos*/
class Transferencia extends Pago {
    /**Nombre del banco*/
    private String banco;
    /**Numero de cuenta*/
    private String numCuenta;
    /**Fecha transaccion*/
    private LocalDate fecha;
    /**Emisor de transaccion*/
    private String nombreEmisor;

    /**Constructor inicializa el numero de cuenta y el banco
     * Ademas se le agrega un parametro cliente que sirve para asociar mejor la tarjeta
     * @param emisor
     * @param banco
     * @param numcuenta
     */
    public Transferencia(Cliente emisor,String banco, String numcuenta) {
        super();
        this.nombreEmisor= emisor.getNombre();
        this.banco = banco;
        this.numCuenta = numcuenta;
    }
    /**Recibe la fecha del pago que se pasara por parametro en ordenCompra para restar al monto
     * @param fechapago
     * @return fechapago
     */
    public LocalDate fechaPago(LocalDate fechapago){
        return fechapago;
    }

    /**Recibe un pago y lo retorna para que pase por parametro de ordencompra
     * @param pago
     * @return pago
     */
    public float pago(float pago){
        return pago;
    }
    /**Informacion de la la clase
     * @return banco y numero de cuenta*/
    @Override
    public String toString() {
        return "Banco asociado: "+banco+", "+"Numero de Cuenta: "+numCuenta;
    }
}
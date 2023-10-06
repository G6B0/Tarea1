import java.time.LocalDate;
/**La idea es crear instancia de esta clase asociada a un titular y pagar
 * continuamente con otras fechas*/
class Tarjeta extends Pago{
    /**Tipo de banco */
    private String tipo;
    /**Numero de transaccion generada por le banco */
    private String NumTransaccion;
    /**Titular de la tarjeta*/
    private String titular;
    /**Constructor recibe un cliente que sera el titular de la tarjeta
     * ademas del tipo de tarjeta(credito o debito)
     * @param titular
     * @param tipo
     */
    public Tarjeta(Cliente titular, String tipo){
        super();
        this.tipo=tipo;
        this.titular= titular.getNombre();
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
    /**Metodo que retorna informacion del tipo de tarjeta
     * @return tipo de tarjeta*/
    @Override
    public String toString() {
        return "Pago con tarjeta tipo:"+tipo;
    }
}
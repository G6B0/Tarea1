import java.time.LocalDate;
/**La clase esta pensada para un solo pago de manera que gestiona logicamente el vuelto
 * con su respectiva fecha */
class Efectivo extends Pago {
    /**Atributo monto que es el dinero que entrega el cliente*/
    private float monto;
    /**La orden que el cliente paga*/
    private OrdenCompra ordenasociada;
    /**Constructor que recibe la plata en efectivo,fecha y orden asociada que quiera pagar
     * @param fecha
     * @param monto
     * @param orden */
    public Efectivo(float monto, LocalDate fecha, OrdenCompra orden) {
        super();
        this.monto=monto;
        this.ordenasociada=orden;
    }
    /**Calcula el vuelto si es que el monto es mayor al total y sino
     * devuelve el monto*/
    public float calcularDevolucion() {
        if (monto >= ordenasociada.calcPrecio()) {
            return monto - ordenasociada.calcPrecio();
        } else {
            return monto;
        }
    }
    /**toString para informacion de cuanto pago
     * @return monto en string*/
    @Override
    public String toString() {
        return "Pago con Efectivo: "+monto;
    }
}

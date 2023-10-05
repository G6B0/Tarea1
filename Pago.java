import java.time.LocalDate;
import java.time.LocalDate;
abstract class Pago{
    private float Monto;
    private LocalDate FechaDePago;
    private OrdenCompra OrdenAsociada;
    public Pago(){
    }
    @Override
    public String toString() {
        return "Monto a pagar:"+Monto+" "+"Fecha del pago:"+FechaDePago;
    }
}
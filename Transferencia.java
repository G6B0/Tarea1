import java.time.LocalDate;
import java.time.LocalDate;
class Transferencia extends Pago {

    private String Banco;
    private String numCuenta;
    private LocalDate Fecha;
    public Transferencia(Cliente emisor,String banco, String numcuenta) {
        super();
        this.Banco = banco;
        this.numCuenta = numcuenta;
    }
    public LocalDate FechaPago(LocalDate fechapago){
        return fechapago;
    }
    public float Pago(float pago){
        return pago;
    }
}
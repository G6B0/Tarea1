import java.time.LocalDate;
class Tarjeta extends Pago{
    private String tipo;
    private String NumTransaccion;
    public Tarjeta(Cliente Titular, String tipo){
        super();
        this.tipo=tipo;
    }
    public LocalDate FechaPago(LocalDate fechapago){
        return fechapago;
    }
    public float Pago(float pago){
        return pago;
    }
    @Override
    public String toString() {
        return "Pago con tarjeta tipo:"+tipo;
    }
}
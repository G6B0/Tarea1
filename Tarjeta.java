import java.time.LocalDate;

class Tarjeta extends Pago{
    private String Tipo;
    private int Plazos;
    private String numTransaccion;
    public Tarjeta(String tipo, String numTransaccion, int plazos, LocalDate fecha, OrdenCompra orden){
        super(fecha,orden);
        this.Tipo=tipo;
        this.numTransaccion=numTransaccion;

    }
}
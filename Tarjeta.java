import java.time.LocalDate;

class Tarjeta extends Pago{
    private String Tipo;
    private int Plazos;
    private String numTransaccion;
    private float montoapagar;
    public Tarjeta(String tipo, String numTransaccion, int plazos, LocalDate fecha, OrdenCompra orden){
        super(fecha,orden);
        this.Tipo=tipo;
        this.numTransaccion=numTransaccion;
        this.Plazos=plazos;
        montoapagar=getMonto()-Plazos;
    }
    public void AgregarPlazo(int pagonuevo,LocalDate fecha){
        montoapagar= montoapagar-pagonuevo;
        fecha = LocalDate.now();
    }
}
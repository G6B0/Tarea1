import java.time.LocalDate;

class Transferencia extends Pago {

    private String Banco;
    private String numCuenta;
    private LocalDate fecha;
    private float cuant;
    private float montoapagar;

    public Transferencia(String banco, String numcuenta,LocalDate fecha,OrdenCompra orden, float cuant) {
        super(fecha, orden);
        this.Banco = banco;
        this.numCuenta = numcuenta;
        this.fecha=fecha;
        this.cuant=cuant;
        montoapagar= orden.calcPrecio()-cuant;
    }
    public void AgregarPlazo(int pagonuevo,LocalDate fecha){
        montoapagar= montoapagar-pagonuevo;
        fecha =LocalDate.now();
    }
    public float getMontoapagar(){
        return montoapagar;
    }
}
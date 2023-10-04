import java.time.LocalDate;

class Transferencia extends Pago {

    private String Banco;
    private String numCuenta;
    private int plazos;

    public Transferencia(String banco, String numcuenta,LocalDate fecha,OrdenCompra orden, float cuant) {
        super(fecha, orden);
        this.Banco = banco;
        this.numCuenta = numcuenta;
    }
    //public void AgregarPlazo();
}

import java.time.LocalDate;
class Pago{
    private float monto;
    private LocalDate fecha;
    public Pago(float monto1, LocalDate fecha1){
        this.monto=monto1;
        this.fecha=fecha1;
    }
    public float getMonto() {
        return monto;
    }
    public LocalDate getFecha() {
        return fecha;
    }
}
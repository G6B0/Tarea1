import java.time.LocalDate;
/**Clase plantilla para las otra clases de medios de pago*/
abstract class Pago{
    /**Monto del pago, atributo por defecto*/
    private float monto;
    /**Fecha de pago, atributo por defecto*/
    private LocalDate fechaDePago;
    /**Inicializa el constructor por defecto ya para usar los demas pagos*/
    public Pago(){
    }
    /**Es abstracto ya que las subclases haran override con sus montos e informacion*/
    public abstract String toString();
}
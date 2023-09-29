import java.time.LocalDate;

public abstract class DocTributario {
    private String Numero;
    private String Rut;
    private LocalDate Fecha;
public DocTributario(String rut, String numero, LocalDate fecha){
    this.Numero=numero;
    this.Rut=rut;
    this.Fecha=fecha;
}
}

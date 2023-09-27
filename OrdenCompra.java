public class OrdenCompra {
    private String fecha;
    private String estado;
    private DetalleOrden serieorden;
    private Cliente usuario;
    public OrdenCompra(Cliente usuario){
        this.usuario=usuario;
        estado="falta pago";
        fecha="xx/xx/xx";

    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }
}

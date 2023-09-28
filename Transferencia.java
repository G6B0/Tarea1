class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(float monto1, String fecha1, String banco1, String numcuenta1) {
        super(monto1, fecha1);
        this.banco = banco1;
        this.numCuenta = numcuenta1;
    }
}

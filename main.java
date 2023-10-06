import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        // Crear productos
        Articulo Sprite = new Articulo(500.0f, "Sprite", "Bebida Sprite de lata", 500.0f);
        Articulo Juguete = new Articulo(100.0f, "Juguete de auto", "juguete de auto material de metal y plastico", 1500.0f);
        Articulo Mouse = new Articulo(90.0f, "Mouse Razer", "Mouse razer 8000 dpi", 5000.0f);
        Articulo Lapiz = new Articulo(20.0f, "Lapiz grafito ", "Lapiz grafito mina 0.7", 450.0f);
        Articulo Queso = new Articulo(250.0f, "Queso colun", "Queso colun ranco 250gramos ", 1290.0f);

        // Crear compradores y sus medios de pago
        Cliente cliente1 = new Cliente("Alonso", "12345678-9", new Direccion("Tucapel 22"));
        Transferencia cuentaCliente1= new Transferencia(cliente1,"Banco Estado","123456778");

        Cliente cliente2 = new Cliente("Fernando", "98765432-1", new Direccion("San martin 39"));
        Tarjeta tarejetaDeCliente2 = new Tarjeta(cliente2,"Credito");


        // Crear órdenes de compra y asociarlo a sus clientes
        OrdenCompra orden1cliente1 = new OrdenCompra(cliente1, LocalDate.now(), new Boleta(cliente1, LocalDate.now()));
        OrdenCompra orden2cliente1 = new OrdenCompra(cliente1, LocalDate.now(), new Factura(cliente1, LocalDate.now()));
        OrdenCompra orden3cliente1 = new OrdenCompra(cliente1, LocalDate.now(), new Factura(cliente1, LocalDate.now()));

        OrdenCompra orden1cliente2 = new OrdenCompra(cliente2, LocalDate.now(), new Factura(cliente2, LocalDate.now()));
        OrdenCompra orden2cliente2 = new OrdenCompra(cliente2, LocalDate.now(), new Boleta(cliente2, LocalDate.now()));
        OrdenCompra orden3cliente2 = new OrdenCompra(cliente2, LocalDate.now(), new Boleta(cliente2, LocalDate.now()));

        // Agregar detalles a las órdenes de compra de cliente 1
        orden1cliente1.agregarDetalle(new DetalleOrden(2, Mouse));
        orden1cliente1.agregarDetalle(new DetalleOrden(5, Sprite));
        System.out.println(orden1cliente1);
        //4 pagos de cliente 1 a su orden
        orden1cliente1.agregarPlazo(cuentaCliente1.pago(4875.0f),cuentaCliente1.fechaPago(LocalDate.of(2023,10,20)));
        System.out.println(orden1cliente1);

        orden1cliente1.agregarPlazo(cuentaCliente1.pago(5000.0f),cuentaCliente1.fechaPago(LocalDate.of(2023,11,20)));
        System.out.println(orden1cliente1);

        orden1cliente1.agregarPlazo(cuentaCliente1.pago(2500.0f),cuentaCliente1.fechaPago(LocalDate.of(2023,12,1)));
        System.out.println(orden1cliente1);

        orden1cliente1.agregarPlazo(cuentaCliente1.pago(2500.0f),cuentaCliente1.fechaPago(LocalDate.of(2023,12,25)));
        System.out.println(orden1cliente1);

        // Agregar detalles a las órdenes de compra de cliente 2
        orden2cliente2.agregarDetalle(new DetalleOrden(10, Lapiz));
        orden2cliente2.agregarDetalle(new DetalleOrden(5, Queso));
        orden2cliente2.agregarDetalle(new DetalleOrden(2, Juguete));
        System.out.println(orden2cliente2);
        //4 pagos de cliente 2 a su orden numero 2
        orden2cliente2.agregarPlazo(tarejetaDeCliente2.pago(2420.0f),tarejetaDeCliente2.fechaPago(LocalDate.now()));
        System.out.println(orden2cliente2);

        orden2cliente2.agregarPlazo(tarejetaDeCliente2.pago(5180.5f),tarejetaDeCliente2.fechaPago(LocalDate.of(2023,10,19)));
        System.out.println(orden2cliente2);

        orden2cliente2.agregarPlazo(tarejetaDeCliente2.pago(2500.0f),tarejetaDeCliente2.fechaPago(LocalDate.of(2023,11,14)));
        System.out.println(orden2cliente2);

        orden2cliente2.agregarPlazo(tarejetaDeCliente2.pago(6499.998f),tarejetaDeCliente2.fechaPago(LocalDate.of(2023,12,18)));
        System.out.println(orden2cliente2);
    }
}

import java.time.LocalDate;

public class main {
    public static void main(String[] args){
        Articulo Shampoo = new Articulo(1500, "LOL", "es grado2", 5000);
        Articulo galleta = new Articulo(480,"Cookie", "dulces",2000);
        Articulo lapiz = new Articulo(20, "Lapiz 0.7", "lapiz de madera", 1500 );
        Articulo mouse = new Articulo(150, "Mouse logitech","tiene 16000 dpi",10000);
        Articulo bebida = new Articulo(1000,"cocacola", "Bebida dulce 1 litro", 1100);
        Cliente cliente1 = new Cliente("Alonso", "213908111", new Direccion("San martin 39"));
        Cliente cliente2 = new Cliente("Fernando", "219294811",new Direccion("Tucapel 22"));
        OrdenCompra ordenDeCliente1= new OrdenCompra(cliente1, LocalDate.now(),new Boleta(cliente1,LocalDate.now()));
        ordenDeCliente1.agregarDetalle(new DetalleOrden(5,galleta));
        ordenDeCliente1.agregarDetalle(new DetalleOrden(2,Shampoo));
        ordenDeCliente1.agregarDetalle(new DetalleOrden(1,mouse));
        ordenDeCliente1.agregarDetalle(new DetalleOrden(2, bebida));
        System.out.println("El monto total de Alonso es:"+ordenDeCliente1.calcPrecioSinIva());
        OrdenCompra ordenDeCliente2= new OrdenCompra(cliente2,LocalDate.now(), new Factura(cliente2,LocalDate.now()));
        ordenDeCliente2.agregarDetalle(new DetalleOrden(6,lapiz));
        ordenDeCliente2.agregarDetalle(new DetalleOrden(4,galleta));
        ordenDeCliente2.agregarDetalle(new DetalleOrden(2,mouse));
        ordenDeCliente2.agregarDetalle(new DetalleOrden(3, bebida));
        System.out.println("El monto total de Fernando es:"+ordenDeCliente2.calcPrecioSinIva());

        Transferencia transferenciaCliente1=new Transferencia(cliente1,"Banco Estado","21731134");
        Tarjeta tarjetaCliente2=new Tarjeta(cliente2,"Credito");
        ordenDeCliente2.agregarPlazo(300,LocalDate.of(2023,10,20));
        System.out.println("El monto total de Fernando es:"+ordenDeCliente2.calcPrecioSinIva());
        ordenDeCliente2.agregarPlazo(40000,LocalDate.of(2023,10,20));
        System.out.println("Estado de pago de Fernando es:"+ordenDeCliente2.getEstado());
    }
}

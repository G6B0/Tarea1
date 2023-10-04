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
OrdenCompra orden1= new OrdenCompra(cliente1, LocalDate.now());
orden1.agregarDetalle(new DetalleOrden(5,galleta));
orden1.agregarDetalle(new DetalleOrden(2,Shampoo));
System.out.print(orden1.calcPrecioSinIva());
    }
}

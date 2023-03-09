import utn.clase4.Carrito;
import utn.clase4.Persona;
import utn.clase4.Producto;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona("Agustín", "Gomez" , null);

        Producto producto1 = new Producto("leche", 112, 12.3);
        Producto producto2 = new Producto("cocacola", 98, 20.75);
        Producto producto3 = new Producto("arroz", 142, 10);

        Carrito carrito = new Carrito(p1);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        carrito.deQuien(p1);
    }
}
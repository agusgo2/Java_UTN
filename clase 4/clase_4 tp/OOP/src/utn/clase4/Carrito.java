package utn.clase4;

public class Carrito {

    public Producto[] productos;

    public Persona persona;
    private int cantidadProductos;

    public Carrito(Persona persona) {
        this.productos = new Producto[3];
        this.cantidadProductos = 0;


    }
    public void agregarProducto(Producto producto) {
        if (cantidadProductos < 3) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
            System.out.println(producto.getNombre() + " agregado al carrito");
        } else {
            System.out.println("El carrito está lleno");
        }
    }

    public void deQuien(Persona persona){
        System.out.println("este carrito es de " + persona.nombre);
    }
}

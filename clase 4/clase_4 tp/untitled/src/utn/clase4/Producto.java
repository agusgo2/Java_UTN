package utn.clase4;

public class Producto {
    public String nombre;

    public int codigo;
    public double precio;

    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}


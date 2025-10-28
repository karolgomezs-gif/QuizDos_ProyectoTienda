// Archivo: Producto.java

public abstract class Producto {
    // 4 Campos base
    protected String id;
    protected String nombre;
    protected double precio;
    protected String marca;

    // Constructor para inicializar los campos
    public Producto(String id, String nombre, double precio, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    // Getters para acceder a los datos
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Operación (Polimorfismo):
    // Cada clase hija deberá definir cómo calcula esto.
    public abstract double calcularEnvio();

    // Método para mostrar información (ayuda a imprimir)
    @Override
    public String toString() {
        return "Producto: " + nombre + " (" + marca + ") - Precio: $" + precio;
    }
}
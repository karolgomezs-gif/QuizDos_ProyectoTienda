// Archivo: Ropa.java

public class Ropa extends Producto {
    
    // Campo 5 (específico de Ropa)
    private String talla;

    // Constructor
    public Ropa(String id, String nombre, double precio, String marca, String talla) {
        // 1. Llama al constructor del "Padre" (Producto)
        super(id, nombre, precio, marca);
        // 2. Inicializa su campo propio
        this.talla = talla;
    }

    // Implementación de la Operación (Polimorfismo)
    @Override
    public double calcularEnvio() {
        // La ropa es ligera, envío barato
        return 5.0; 
    }

    // Sobrescribimos toString para mostrar también la talla
    @Override
    public String toString() {
        return super.toString() + " - Talla: " + talla;
    }
}
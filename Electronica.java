// Archivo: Electronica.java

public class Electronica extends Producto {

    // Campo 5 (específico de Electronica)
    private int mesesGarantia;

    // Constructor
    public Electronica(String id, String nombre, double precio, String marca, int mesesGarantia) {
        // 1. Llama al constructor del "Padre" (Producto)
        super(id, nombre, precio, marca);
        // 2. Inicializa su campo propio
        this.mesesGarantia = mesesGarantia;
    }

    // Implementación de la Operación (Polimorfismo)
    @Override
    public double calcularEnvio() {
        // La electrónica es frágil, envío caro
        return 20.0;
    }

    // Sobrescribimos toString para mostrar la garantía
    @Override
    public String toString() {
        return super.toString() + " - Garantía: " + mesesGarantia + " meses";
    }
}
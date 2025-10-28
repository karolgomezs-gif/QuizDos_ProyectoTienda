// Archivo: CarritoDeCompras.java

// Importamos las clases para usar Listas
import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {

    // La Lista (Array) de Productos
    // Fíjate que la lista es de "Producto" (el padre),
    // pero podremos agregar Ropa y Electronica (los hijos).
    private List<Producto> items;

    // Constructor
    public CarritoDeCompras() {
        this.items = new ArrayList<>();
    }

    // Método para agregar items a la lista
    public void agregarProducto(Producto producto) {
        this.items.add(producto);
        System.out.println(producto.getNombre() + " ha sido añadido al carrito.");
    }

    // Método para calcular el total (¡Aquí se ve el polimorfismo!)
    public double calcularTotal() {
        double subtotal = 0.0;
        double costoEnvioTotal = 0.0;

        // Recorremos la lista
        for (Producto item : this.items) {
            // 1. Sumamos el precio del producto
            subtotal += item.getPrecio();
            
            // 2. Sumamos el costo de envío
            // AQUI OCURRE EL POLIMORFISMO:
            // Si 'item' es Ropa, llama a Ropa.calcularEnvio() (devuelve 5.0)
            // Si 'item' es Electronica, llama a Electronica.calcularEnvio() (devuelve 20.0)
            costoEnvioTotal += item.calcularEnvio();
        }

        System.out.println("------------------------------------");
        System.out.println("Subtotal de productos: $" + subtotal);
        System.out.println("Costo total de envío:  $" + costoEnvioTotal);
        
        // Devuelve el gran total
        return subtotal + costoEnvioTotal;
    }

    // Método para mostrar lo que hay en el carrito
    public void mostrarItems() {
        System.out.println("--- Items en el Carrito ---");
        for (Producto item : this.items) {
            System.out.println(item.toString()); // Llama al toString() de Ropa o Electronica
        }
    }
}
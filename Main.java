// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema E-commerce...\n");

        // 1. Creamos los productos (los hijos)
        Producto camisa = new Ropa("r001", "Camisa de Lino", 45.0, "Zara", "M");
        Producto television = new Electronica("e001", "Smart TV 55\"", 500.0, "Samsung", 12);
        Producto jeans = new Ropa("r002", "Jeans Vaqueros", 60.0, "Levi's", "32");

        // 2. Creamos el carrito (que usa la Lista)
        CarritoDeCompras miCarrito = new CarritoDeCompras();
        
        // 3. Añadimos los productos
        miCarrito.agregarProducto(camisa);
        miCarrito.agregarProducto(television);
        miCarrito.agregarProducto(jeans);

        System.out.println(); // Salto de línea

        // 4. Mostramos los items
        miCarrito.mostrarItems();

        // 5. Calculamos el total (la Operación polimórfica)
        double granTotal = miCarrito.calcularTotal();

        System.out.println("------------------------------------");
        System.out.println("GRAN TOTAL A PAGAR:    $" + granTotal);
    }
}
# 🛒 Proyecto: Carrito de Compras (Demo OOP en Java)

Este proyecto es una demostración práctica de principios clave de la Programación Orientada a Objetos (OOP) en Java, aplicado a un problema cotidiano: gestionar el carrito de compras de una tienda online.

## 🎯 El Desafío

El objetivo era plantear un problema que, utilizando Java, cumpliera con los siguientes requisitos:

* Un problema cotidiano.
* Que el modelo de datos tuviera un mínimo de 5 campos.
* El uso de una lista o array.
* La implementación de al menos una operación.
* La implementación de Herencia y/o Polimorfismo.

---

## 💡 La Solución

Se diseñó un sistema simple para un E-commerce que maneja diferentes tipos de productos, cada uno con sus propias reglas de negocio (como el costo de envío).

### 1. Herencia y 5 Campos

Para evitar repetir código, se utilizó la **Herencia**:

* **`Producto.java` (Clase Padre):** Es una clase abstracta que define los atributos comunes a todos los productos:
    * `id`
    * `nombre`
    * `precio`
    * `marca`
* **`Ropa.java` (Clase Hija):** Hereda de `Producto` y añade su campo propio:
    * `talla` (Este es el 5to campo)
* **`Electronica.java` (Clase Hija):** Hereda de `Producto` y añade su campo propio:
    * `mesesGarantia` (Este es el 5to campo)

### 2. Polimorfismo y Operación

El **Polimorfismo** (junto con una **Operación**) se implementa en el método `calcularEnvio()`.

* El método se define como `abstract` en `Producto`, forzando a las clases hijas a implementarlo.
* **En `Ropa.java`:** El método devuelve un costo de envío bajo (ej: $5.0), ya que es ligero.
* **En `Electronica.java`:** El método devuelve un costo de envío alto (ej: $20.0), ya que es frágil.

Cuando el carrito calcula el total, simplemente llama a `item.calcularEnvio()` y Java sabe automáticamente qué versión del método usar (la de Ropa o la de Electrónica).

### 3. Lista o Array

La **Lista** se utiliza en la clase **`CarritoDeCompras.java`**.

* Se usa un `ArrayList` para almacenar los `items`:
    `private List<Producto> items;`
* Gracias al polimorfismo, esta lista (declarada para `Producto`) puede almacenar objetos de sus clases hijas (`Ropa` y `Electronica`) sin ningún problema.

---

## 🚀 Cómo Ejecutar

1.  Clona o descarga este repositorio.
2.  Abre la carpeta del proyecto en un IDE de Java (como Visual Studio Code con el "Extension Pack for Java").
3.  Ejecuta el archivo **`Main.java`**.
4.  La salida de la simulación del carrito se mostrará en la consola.

## 📂 Archivos del Proyecto

* **`Producto.java`**: Clase padre abstracta.
* **`Ropa.java`**: Clase hija que hereda de Producto.
* **`Electronica.java`**: Clase hija que hereda de Producto.
* **`CarritoDeCompras.java`**: Clase que gestiona la lista de productos y calcula el total.
* **`Main.java`**: Punto de entrada del programa. Crea los objetos y ejecuta la simulación.
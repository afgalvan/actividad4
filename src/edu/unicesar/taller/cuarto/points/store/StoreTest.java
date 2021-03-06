/*
 * Se desea crear una aplicación en java para el registro del inventario de
 * productos de una tienda. Para ello, se solicita diseñar e implementar la
 * clase Producto, con atributos de instancia para el Código, nombre, precio de
 * compra, porcentaje de utilidad. La clase debe implementar método constructor,
 * getters y setters para sus atributos y el método precioVenta, que retornara
 * el precio de venta al público (a partir del % de utilidad del producto).
 * Implementar una clase principal, en la que se defina un arreglo de Productos,
 * se registren datos de diferentes productos y luego se impriman incluyendo el
 * precio de venta.
 */

package edu.unicesar.taller.cuarto.points.store;

public class StoreTest {
    public static void main() {
        Store store = new Store();
        store.addProducts();
        store.showInventory();
    }
}

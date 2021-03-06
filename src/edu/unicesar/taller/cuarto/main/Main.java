package edu.unicesar.taller.cuarto.main;

import edu.unicesar.taller.cuarto.menu.Menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> options = new LinkedHashMap<>();
        options.put("Rectángulo", "rectangle.RectangleTest");
        options.put("Coche", "car.CarTest");
        options.put("Triángulo Isoceles", "triangle.IsoscelesTriangleTest");
        options.put("Bicicleta", "bicycle.BicycleTest");
        options.put("Producto", "product.ProductTest");
        options.put("Libro", "book.BookTest");
        options.put("Cuenta", "account.AccountTest");
        options.put("Reloj", "clock.ClockTest");
        options.put("Fracción", "fraction.FractionTest");
        options.put("Caída Libre", "freefall.FreeFallTest");
        options.put("", "");
        options.put("Salir", "Exit");

        Menu menu = new Menu(options);
        menu.display();
    }
}

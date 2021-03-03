package edu.unicesar.taller.cuarto.main;

import edu.unicesar.taller.cuarto.menu.Menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> options = new LinkedHashMap<>();
        options.put("Rectángulo", "RectangleTest");
        options.put("Coche", "CarTest");
        options.put("Triángulo Isoceles", "IsoscelesTriangleTest");
        options.put("Bicicleta", "BikeTest");
        options.put("Producto", "ProductTest");
        options.put("Libro", "BookTest");
        options.put("Cuenta", "AccountTest");
        options.put("Reloj", "ClockTest");
        options.put("Fracción", "Fraction");
        options.put("Caída Libre", "FreeFall");
        options.put("", "");
        options.put("Salir", "Exit");

        Menu menu = new Menu(options);
        menu.prompt();
    }
}

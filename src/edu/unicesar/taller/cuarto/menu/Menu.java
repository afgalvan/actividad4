package edu.unicesar.taller.cuarto.menu;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;


public class Menu {
    public static Scanner scanner = new Scanner(System.in);
    private final Map<String, String> options;
    private final int optionsLen;
    private final String[] optionKeys;

    public Menu(Map<String, String> options) {
        this.options = options;
        this.optionsLen = options.size() - 2;
        this.optionKeys = options.keySet().toArray(new String[0]);
    }

    /**
     * Muestra las opciones del menú con sus respectivos indices en consola.
     */
    public void prompt() {
        int status;

        do {
            do {
                System.out.print("\033\143");
                System.out.println("\t   MENU\n");
                boxIn(optionKeys);
                status = menuHandler(optionKeys);
            } while (status == 1);

            if (status != -1) {
                System.out.print("\nPresione cualquier tecla para volver al menu...");
                scanner.nextLine();
                scanner.nextLine();
            }
        } while (status != -1);
    }

    /**
     * Encapsula un arreglo de strings en una cuadro para mostrar con índices
     * para ser usado en un menú de terminal.
     *
     * @param elements Arreglo para mostrar en el cuadro.
     */
    private void boxIn(String[] elements) {
        int squareWidth = longestString(elements);

        printSeparator(squareWidth);
        for (int i = 0; i < elements.length; i++) {
            String index = (i + 1) + ".";
            if (elements[i].equals("Salir")) {
                index = "0.";
            } else if (elements[i].isEmpty()) {
                index = " ";
            }
            System.out.printf("| %3s %s", index, elements[i]);

            int spaceBetween = squareWidth - elements[i].length();
            String space = new String(new char[spaceBetween]).replace("\0", " ");
            System.out.print(space);
            System.out.println(" |");
        }
        printSeparator(squareWidth);
    }

    /**
     * Calcular el string más largo de un arreglo.
     *
     * @param array arreglo para calcular su elemento más largo.
     * @return la longitud del string más largo del arreglo.
     */
    private int longestString(String[] array) {
        List<String> strings = Arrays.asList(array);
        String longest = strings.stream().
            max(Comparator.comparingInt(String::length)).get();

        return longest.length();
    }

    /**
     * Mostrar por consola una línea dependiendo de un tamaño dado.
     *
     * @param lineLen tamaño de la linea.
     */
    private void printSeparator(int lineLen) {
        System.out.print("+");
        String line = new String(new char[lineLen+6]).replace('\0', '-');
        System.out.print(line);
        System.out.println("+");
    }

    /**
     * Manejador de opciones para el menú  y ejecutar el punto recibido por el
     * usuario.
     *
     * @param points Opciones del menú.
     * @return estado de sálida.
     */
    private int menuHandler(String[] points) {
        System.out.print("\n Escoja una opción: ");
        int choice = scanner.nextInt();
        if (choice < 0 || choice > optionsLen) {
            return 1;
        } else if (choice == 0) {
            return -1;
        }
        try {
            System.out.print("\033\143");
            System.out.printf("\t\t%s\n\n", points[choice - 1]);
            executePoint(choice);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return 0;
    }

    /**
     * Dado un indice, buscar la clase y el método para ejecutar un punto de la
     * actividad.
     *
     * @param i punto de la actividad.
     * @throws Exception Enviar error en caso de una clase o método no encontrado.
     */
    private void executePoint(int i) throws Exception {
        String className = "edu.unicesar.taller.cuarto.points." + options.get(optionKeys[i-1]);
        Class<?> pointClass = Class.forName(className);
        Method pointMethod = pointClass.getDeclaredMethod("main");
        pointMethod.invoke(pointClass);
    }
}

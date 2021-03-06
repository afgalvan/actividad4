/*
 * Implementa la clase Bicicleta, que tiene tres atributos, velocidadActual,
 * platoActual y piñonActual, de tipo entero, método constructor, getters y
 * setters, y los siguientes métodos miembros: acelerar (), frenar (),
 * cambiarPlato (int plato), y cambiarPiñon (int piñon), donde el primero dobla
 * la velocidad actual, el segundo reduce a la mitad la velocidad actual, y el
 * tercero y cuarto ajustan el plato y el piñón actual respectivamente según los
 *  parámetros recibidos. Crear una clase principal, e instancia un objeto
 * bicicleta y mostrar sus comportamientos.
 */

package edu.unicesar.taller.cuarto.points.bicycle;

public class BicycleTest {
    /**
     * Implementar la clase Bicycle con diferentes objetos aplicando diferentes
     * métodos y atributos.
     */
    public static void main() {
        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle(2, 3);
        Bicycle bicycle3 = new Bicycle(4, 1);
        Bicycle[] bicycles = {bicycle1, bicycle2, bicycle3};

        bicycle1.speedUp();
        bicycle1.speedUp();
        bicycle1.speedUp();
        bicycle2.speedUp();
        showBicycles(bicycles);

        System.out.println("=========================\n");
        bicycle1.setChainRing(2);
        bicycle1.brake();
        bicycle3.speedUp();
        bicycle3.speedUp();
        bicycle3.setChainRing(5);
        bicycle3.speedUp();
        bicycle3.speedUp();
        bicycle2.brake();
        bicycle2.setCogSet(1);
        showBicycles(bicycles);
    }

    /**
     * Mostrar la información de una lista de bicicletas.
     *
     * @param bicycles Lista de bicicletas.
     */
    public static void showBicycles(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            System.out.printf("Bicicleta %d\n", i + 1);
            System.out.printf("Velocidad actual: %d\n", bicycles[i].getSpeed());
            System.out.printf("Plato actual: %d\n", bicycles[i].getChainRing());
            System.out.printf("Piñón actual: %d\n\n", bicycles[i].getCogSet());
        }
    }
}

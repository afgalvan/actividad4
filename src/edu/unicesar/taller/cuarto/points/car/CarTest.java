package edu.unicesar.taller.cuarto.points.car;

public class CarTest {
    /**
     * Implementación y demostración del uso de la clase Car.
     */
    public static void main() {
        Car car1 = new Car("Ferrari", 2021, Color.RED, "VUE-923", 620, 2);
        Car car2 = new Car("Land Rover", 2020, Color.YELLOW, "WXY-626", 309, 4);
        Car car3 = new Car("Rolls Royce", 2018, Color.WHITE, "XQC-777", 460, 4);

        System.out.println("CARRO 1");
        prompt(car1, Color.GREEN);

        System.out.println("\nCARRO 2");
        prompt(car2, Color.PURPLE);

        System.out.println("\nCARRO 3");
        prompt(car3, Color.BLUE);
    }

    public static void prompt(Car car, Color newColor) {
        car.displayInfo();
        System.out.println("== CAMBIO DE COLOR ==");
        car.setColor(newColor);
        System.out.printf("Color: %s\n", car.getColor());
    }
}

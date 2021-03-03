package edu.unicesar.taller.cuarto.points;

import java.io.Serializable;

public class CarTest {
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

class Car {
    private final String brand;
    private final int model;
    private Color color;
    private final String plate;
    private final int horsePower;
    private final int doorsNumber;

    public Car(String brand, int model, Color color, String plate, int horsePower,
               int doorsNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.horsePower = horsePower;
        this.doorsNumber = doorsNumber;
    }

    public String getColor() {
        return color.getColor() + Color.NORMAL.getColor();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void displayInfo() {
        System.out.printf("Marca: %s\n", brand);
        System.out.printf("Modelo: %d\n", model);
        System.out.printf("Color: %s\n", getColor());
        System.out.printf("Placa: %s\n", plate);
        System.out.printf("Caballos de fuerza: %d\n", horsePower);
        System.out.printf("Numero de puertas: %d\n", doorsNumber);
    }
}

enum Color implements Serializable {
    RED("\033[1;31mRojo"),
    GREEN("\033[1;32mVerde"),
    YELLOW("\033[1;33mAmarillo"),
    BLUE("\033[1;34mAzul"),
    PURPLE("\033[1;35mMorado"),
    WHITE("\033[1;97mBlanco"),
    NORMAL("\033[0m");

    private final String color;

    Color(String _color) {
        this.color = _color;
    }

    public String getColor() {
        return color;
    }
}

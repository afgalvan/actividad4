package edu.unicesar.taller.cuarto.points.car;

import edu.unicesar.taller.cuarto.points.Entity;

class Car implements Entity {
    private final String brand;
    private final int model;
    private Color color;
    private final String plate;
    private final int horsePower;
    private final int doorsNumber;

    /**
     * Representación de un carro con diferentes propiedades y con la cacidad de
     * mostrar y cambiar su color.
     *
     * @param brand Marca del carro.
     * @param model Modelo del carro.
     * @param color Color incial del carro.
     * @param plate Placa del carro.
     * @param horsePower Caballos de fuerza del carro.
     * @param doorsNumber Número de puertas del carro.
     */
    public Car(String brand, int model, Color color, String plate, int horsePower,
               int doorsNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.horsePower = horsePower;
        this.doorsNumber = doorsNumber;
    }

    /**
     * Obtiene el color actual del vehículo.
     *
     * @return Un string con el nombre y código ANSI del color.
     */
    public String getColor() {
        return color.getColor() + Color.NORMAL.getColor();
    }

    /**
     * Cambia o establece el color del vehículo.
     *
     * @param color Un literal disponible en el enum Color.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Muestra la información del carro.
     */
    @Override
    public void displayInfo() {
        System.out.printf("Marca: %s\n", brand);
        System.out.printf("Modelo: %d\n", model);
        System.out.printf("Color: %s\n", getColor());
        System.out.printf("Placa: %s\n", plate);
        System.out.printf("Caballos de fuerza: %d\n", horsePower);
        System.out.printf("Numero de puertas: %d\n", doorsNumber);
    }
}

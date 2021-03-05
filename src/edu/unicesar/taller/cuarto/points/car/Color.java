package edu.unicesar.taller.cuarto.points.car;

import java.io.Serializable;

public enum Color implements Serializable {
    RED("\033[1;31mRojo"),
    GREEN("\033[1;32mVerde"),
    YELLOW("\033[1;33mAmarillo"),
    BLUE("\033[1;34mAzul"),
    PURPLE("\033[1;35mMorado"),
    WHITE("\033[1;97mBlanco"),
    NORMAL("\033[0m");

    private final String color;

    /**
     * Enum de colores para mostrar por consola.
     *
     * @param _color
     */
    Color(String _color) {
        this.color = _color;
    }

    /**
     * Obtiene el valor del color.
     *
     * @return Un string con el nombre y el código ANSI del color.
     */
    public String getColor() {
        return color;
    }
}

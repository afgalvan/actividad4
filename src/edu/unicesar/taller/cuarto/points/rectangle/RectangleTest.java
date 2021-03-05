/*
 * Crear una clase Rectángulo, con atributos longitud y ancho. Crear también el
 * constructor de la clase y los métodos necesarios para calcular el área y el
 * perímetro. Crear otra clase PruebaRectangulo que pruebe varios rectángulos y
 * muestre por pantalla sus áreas y perímetros.
 */

package edu.unicesar.taller.cuarto.points.rectangle;

import edu.unicesar.taller.cuarto.points.Entity;

public class RectangleTest {

    private static class Rectangle implements Entity {
        private final double height;
        private final double width;

        /**
         * Representación de un triángulo para calcular su área y perímetro.
         *
         * @param height altura del rectángulo.
         * @param width ancho del rectángulo.
         */
        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        /**
         * Calcula el area de el triángulo.
         *
         * @return área del triangulo.
         */
        public double calculateArea() {
            return height * width;
        }

        /**
         * Calcula el perímetro del rectángulo.
         *
         * @return perímetro del rectángulo.
         */
        public double calculatePerimeter() {
            return 2 * (height + width);
        }

        /**
         * Mostrar datos relevantes del rectángulo.
         */
        @Override
        public void displayInfo() {
            System.out.printf(" Altura   : %.2f\n", height);
            System.out.printf(" Ancho    : %.2f\n", width);
            System.out.printf(" Área     : %.2f\n", calculateArea());
            System.out.printf(" Perimetro: %.2f\n", calculatePerimeter());
        }
    }

    public static void main() {
        Rectangle rectangle1 = new Rectangle(2.3, 5.6);
        Rectangle rectangle2 = new Rectangle(6.2, 11.1);
        Rectangle rectangle3 = new Rectangle(2.0, 1.3);
        Rectangle rectangle4 = new Rectangle(4.8, 7.9);
        Rectangle[] rectangles = new Rectangle[]{rectangle1, rectangle2,
            rectangle3, rectangle4};

        for (int i = 0; i < rectangles.length; ++i) {
            System.out.printf("RECTANGULO %d\n", i + 1);
            rectangles[i].displayInfo();
            System.out.print("\n");
        }
    }

}

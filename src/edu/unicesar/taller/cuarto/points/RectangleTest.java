package edu.unicesar.taller.cuarto.points;

public class RectangleTest {

    private static class Rectangle {
        private final double height;
        private final double width;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }

        public double calculateArea() {
            return height * width;
        }

        public double calculatePerimeter() {
            return 2 * (height + width);
        }

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

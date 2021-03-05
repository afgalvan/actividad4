package edu.unicesar.taller.cuarto.points.triangle;

public class IsoscelesTriangleTest {
    public static void main() {
        IsoscelesTriangle triangle1 = new IsoscelesTriangle(11.78, 12);
        IsoscelesTriangle triangle2 = new IsoscelesTriangle(3.5, 8, "m");

        System.out.println("TRIÁNGULO 1.");
        triangle1.displayInfo();
        System.out.println("\nTRIÁNGULO 2.");
        triangle2.displayInfo();
    }
}

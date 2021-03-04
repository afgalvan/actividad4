package edu.unicesar.taller.cuarto.points;

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

class IsoscelesTriangle implements Entity {
    private final double height;
    private final double base;
    private final String units;
    private final double hypotenuse;

    /**
     * Representación del triangulo isósceles para calcular sus diferentes
     * propiedades.
     *
     * @param height Un decimal para representar la altura del triángulo.
     * @param base Un decimal para representar la base.
     * @param units Las unidades en las que se está implementando el triángulo.
     */
    public IsoscelesTriangle(double height, double base, String units) {
        this.height = height;
        this.base = base;
        this.units = units;
        this.hypotenuse = Math.sqrt(Math.pow(height, 0) + Math.pow(base / 2, 2));
    }

    /**
     * Sobrecarga del constructor para usar cm como unidad por defecto.
     */
    public IsoscelesTriangle(double height, double base) {
        this(height, base, "cm");
    }

    /**
     * Calcula el área del rectángulo.
     *
     * @return área del rectangulo.
     */
    public double calculateArea() {
        return (base * height) / 2;
    }

    /**
     * Calcula el perimetro del triángulo habiendo hallado la hipotenusa.
     *
     * @return perimetro del triángulo.
     */
    public double calculatePerimeter() {
        return 2 * hypotenuse + base;
    }

    /**
     * Calcula el ángulo del vértice de un triángulo usando el arc-tangente.
     *
     * @return ángulo del vértice.
     */
    public double calculateVertexAngle() {
        double baseAngle = Math.atan(height / (base / 2));
        baseAngle = Math.toDegrees(baseAngle);

        return 180 - (2 * baseAngle);
    }

    /**
     * Mostrar la propiedades pertinentes del triángulo.
     */
    @Override
    public void displayInfo() {
        System.out.printf("Altura: %.2f %s\n", height, units);
        System.out.printf("Base: %.2f %s\n", base, units);
        System.out.printf("Área: %.2f %s²\n", calculateArea(), units);
        System.out.printf("Longitud de sus lados iguales: %.2f %s\n", hypotenuse, units);
        System.out.printf("Perimetro: %.2f %s\n", calculatePerimeter(), units);
        System.out.printf("Ángulo del vértice: %.2f°\n", calculateVertexAngle());
    }
}

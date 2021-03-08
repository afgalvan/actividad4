package edu.unicesar.taller.cuarto.points.freefall;

public class FreeFall {
    public static void main() throws InterruptedException {
        Body body = new Body(63.19);
        System.out.printf("Altura: %.2f m\n", body.getHeight());
        System.out.printf("Velocidad: %.2f m/s\n", body.getSpeed());
        body.release();
        System.out.println("\n*Se deja caer el cuerpo*");
        Thread.sleep((long) body.getTime() * 1000);
        System.out.printf("Altura: %.0f m\n", body.getHeight());
        System.out.printf("Velocidad de caída: %.2f m/s\n", body.getSpeed());
        System.out.printf("Tiempo de caída: %.2f s\n", body.getTime());
    }
}

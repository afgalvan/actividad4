package edu.unicesar.taller.cuarto.points.freefall;

public class Body {
    private double height;
    private final double gravity;
    private double speed;
    private double time;

    public Body(double height) {
        this.height = height;
        this.gravity = 9.81;
        this.speed = 0;
        this.time = 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void release() {
        time = Math.sqrt((2 * height) / gravity);
        speed = gravity * getTime();
        height = 0;
    }

    public double getTime() {
        return time;
    }

    public double getSpeed() {
        return speed;
    }
}

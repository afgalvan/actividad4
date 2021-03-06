package edu.unicesar.taller.cuarto.points.bicycle;

class Bicycle {
    private int speed;
    private int chainRing;
    private int cogSet;

    /**
     * Representación de bicicleta.
     */
     public Bicycle(int chainRing, int cogSet) {
        this.chainRing = chainRing;
        this.cogSet = cogSet;
        this.speed = 0;
    }

    public Bicycle() {
         this(1, 1);
    }

    /**
     * Acelerar la bicicleta; dobla la velocidad.
     */
    public void speedUp() {
         if (speed == 0) {
             speed += 2;
         } else {
             speed *= 2;
         }
    }

    /**
     * Frenar la bicicleta; divide su velocidad a la mitad.
     */
    public void brake() {
        speed /= 2;
    }

    /**
     * @return El valor de la velocidad de la bicicleta.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @return El valor de el plato en uso.
     */
    public int getChainRing() {
        return chainRing;
    }

    /**
     * Cambia o establece el valor del plato de una bicileta.
     *
     * @param chainRing Un entero que representa el plato.
     */
    public void setChainRing(int chainRing) {
        this.chainRing = chainRing;
    }

    /**
     * @return El valor del piñon de la bicicleta.
     */
    public int getCogSet() {
        return cogSet;
    }

    /**
     * Cambia o establece el valor del piñón de una bicicleta.
     *
     * @param cogSet Un entero que representa el piñón.
     */
    public void setCogSet(int cogSet) {
        this.cogSet = cogSet;
    }
}

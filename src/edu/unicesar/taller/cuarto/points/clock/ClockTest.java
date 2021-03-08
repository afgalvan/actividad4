/*
 * Crear la clase Reloj, con atributos de instancia para las horas, minutos y
 * segundos, atributo de clase para el formato de impresión
 * (0 – militar, 1 – AM/PM, 2-Texto), método constructor, getters y setters, los
 * métodos miembros: SS+(), MM+(), HH()+, para incrementar en 1, los segundos,
 * minutos y horas respectivamente. Así mismo, los métodos SS-(), MM-(), HH-(),
 * para disminuir en 1 los segundos, minutos y horas respectivamente, métodos
 * que retornen la hora en formato militar, en formato AM/PM, en formato texto
 * (“cinco y cincuenta am”, o “dos y treinta y cinco pm”) y finalmente un método
 * denominado getHora que debe retornar la hora en el formato correspondiente
 * según el atributo indicado.
 * Crea una clase principal e instancia dos objetos reloj, la ejecución del
 * aplicativo debe mostrar las horas de los relojes en distintos formatos.
 */

package edu.unicesar.taller.cuarto.points.clock;

public class ClockTest {
    public static void main() {
        Clock clock1 = new Clock(0, 42, 4);
        Clock clock2 = new Clock(18, 59, 17);

        System.out.println("RELOJ 1");
        clock1.HHAdd();
        displayHours(clock1);
        System.out.println("\nRELOJ 2");
        clock2.MMAdd();
        displayHours(clock2);
    }

    public static void displayHours(Clock clock) {
        clock.setFormat('0');
        System.out.println(clock.getHour());
        clock.setFormat('1');
        System.out.println(clock.getHour());
        clock.setFormat('2');
        System.out.println(clock.getHour());
    }
}

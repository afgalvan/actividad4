package edu.unicesar.taller.cuarto.main;

import edu.unicesar.taller.cuarto.menu.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new String[]{
            "Rectangulo",
            "Salir"
        });
        menu.menuPrompt();
    }
}

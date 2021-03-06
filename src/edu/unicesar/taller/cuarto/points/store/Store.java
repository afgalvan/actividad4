package edu.unicesar.taller.cuarto.points.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
    private final List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProducts() {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            Product product = new Product();
            System.out.print("Ingrese el código del producto: ");
            product.setCode(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Ingrese el nombre del producto: ");
            product.setName(scanner.nextLine());
            System.out.print("Ingrese el producto original: ");
            product.setOriginalPrice(scanner.nextDouble());
            System.out.print("Ingrese el porcentaje de utilidad: ");
            product.setUtilityPercent(scanner.nextDouble());
            products.add(product);

            System.out.print("\nDesea agregar otro producto? (s/N): ");
            choice = scanner.next().toLowerCase().charAt(0);
            System.out.println();
        } while (choice == 's');
    }

    public void showInventory() {
        System.out.println("\nINVENTARIO DE PRODUCTOS");
        products.forEach(product -> {
            System.out.printf("\nCódigo: %d\n", product.getCode());
            System.out.printf("Nombre: %s\n", product.getName());
            System.out.printf("Precio original: $%.2f\n", product.getOriginalPrice());
            System.out.printf("Utilidad: %.2f%%\n", product.getUtilityPercent());
            System.out.printf("Precio sugerido: $%.2f\n", product.getPublicPrice());
        });
    }
}

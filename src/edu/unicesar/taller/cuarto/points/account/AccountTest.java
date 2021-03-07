
package edu.unicesar.taller.cuarto.points.account;

import java.util.Scanner;

public class AccountTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main() {
        Account account = new Account();
        String[] actions = new String[]{"depositar", "retirar"};
        String actionResult = "";

        initAccount(account);
        int action = Character.getNumericValue(userAction(account));
        switch (action) {
            case 1:
                account.deposit(askAmountTo(actions[action-1]));
                break;
            case 2:
                account.withdraw(askAmountTo(actions[action-1]));
                break;
            default:
                break;
        }
        showAccount(account);
    }

    public static void initAccount(Account account) {
        System.out.print("Ingrese número de cuenta: ");
        account.setNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Ingrese su nombre: ");
        account.setClientName(scanner.nextLine());
        System.out.print("Ingrese balance inicial: $");
        account.setBalance(scanner.nextDouble());
    }

    public static char userAction(Account account) {
        char choice;

        System.out.printf("\nBIENVENIDO %S!\n", account.getClientName());
        System.out.println("¿Que acción desea realizar?");
        do {
            System.out.println("1. Depositar dinero en la cuenta.");
            System.out.println("2. Retirar dinero de la cuenta.");
            System.out.print("> ");
            choice = scanner.next().charAt(0);
        } while (choice != '1' && choice != '2');
        return choice;
    }

    public static double askAmountTo(String action) {
        System.out.printf("Ingrese la cantidad para %s: $", action);
        return scanner.nextDouble();
    }

    public static void showAccount(Account account) {
        System.out.printf("Número de cuenta: %d\n", account.getNumber());
        System.out.printf("Nombre: %s\n", account.getClientName());
        System.out.printf("Saldo: %.2f\n", account.getBalance());
    }
}

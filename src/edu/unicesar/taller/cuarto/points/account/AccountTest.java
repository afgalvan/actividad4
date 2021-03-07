
package edu.unicesar.taller.cuarto.points.account;

import java.util.Scanner;

public class AccountTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main() {
        Account account = new Account();

        initAccount(account);
        int action = 1;
        while (action != 0) {
            action = transaction(account);
            showAccount(account);
        }
    }

    public static void initAccount(Account account) {
        System.out.print("Ingrese número de cuenta: ");
        account.setNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Ingrese su nombre: ");
        account.setClientName(scanner.nextLine());
        System.out.print("Ingrese balance inicial: $");
        account.setBalance(scanner.nextDouble());
        System.out.print("\033\143");
    }

    public static char userAction(Account account) {
        char choice;

        System.out.printf("BIENVENIDO %S!\n\n", account.getClientName());
        System.out.println("¿Que acción desea realizar?");
        do {
            System.out.println("1. Depositar dinero en la cuenta.");
            System.out.println("2. Retirar dinero de la cuenta.");
            System.out.println("0. Salir de la cuenta.");
            System.out.print("\n> ");
            choice = scanner.next().charAt(0);
        } while (choice != '1' && choice != '2' && choice != '0');
        System.out.print("\033\143");
        return choice;
    }

    public static int transaction(Account account) {
        int action = Character.getNumericValue(userAction(account));
        String[] actions = new String[]{"depositar", "retirar"};
        String actionResult = "";

        switch (action) {
            case 1:
                if (account.deposit(askAmountTo(actions[action - 1]))) {
                    actionResult = "Se";
                } else {
                    actionResult = "No se";
                }
                break;
            case 2:
                if (account.withdraw(askAmountTo(actions[action - 1]))) {
                    actionResult = "Se";
                } else {
                    actionResult = "No se";
                }
                break;
            case 3:
                return action;
            default:
                break;
        }
        System.out.printf("%s pudo %s $%.2f en la cuenta.\n", actionResult,
            actions[action - 1], account.getLastTransaction());
        return action;
    }

    public static double askAmountTo(String action) {
        System.out.printf("Ingrese la cantidad para %s: $", action);
        return scanner.nextDouble();
    }

    public static void showAccount(Account account) {
        System.out.println("\nESTADO DE LA CUENTA.");
        System.out.printf("Número de cuenta: %d\n", account.getNumber());
        System.out.printf("Nombre: %s\n", account.getClientName());
        System.out.printf("Saldo: %.2f\n", account.getBalance());
    }
}

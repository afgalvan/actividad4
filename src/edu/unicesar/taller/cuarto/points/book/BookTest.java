/**
 * Crea una clase Libro que modele la información que se mantiene en una
 * biblioteca sobre cada libro: título, primer nombre, segundo nombre, primer
 * apellido, ISBN, páginas, edición, editorial, ciudad, país y fecha de edición
 * (String). La clase debe proporcionar los siguientes servicios: getters y
 * setters. Implementar una clase principal, en la cual, además del método main,
 * se debe implementar método para leer la información del Libro y método para
 * mostrar su información.
 *
 * Este último método mostrará la información del libro con este formato:
 * Título: Introduction to Java Programming
 * 3ra. edición
 * Autor: Liang, Y. Daniel
 * ISBN: 0-13-031997-X
 * Prentice-Hall, New Jersey (USA), viernes 16 de noviembre de 2001
 * 784 páginas
 */

package edu.unicesar.taller.cuarto.points.book;

import java.util.Scanner;

public class BookTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main() {
        Library library = new Library();
        addBooks(library);
        displayBooks(library);
    }

    public static void addBooks(Library library) {
        char choice;

        do {
            Book book = new Book();
            Author author = new Author();

            System.out.print("Ingrese el titulo del libro: ");
            book.setTitle(scanner.nextLine());

            System.out.print("Ingrese el primer nombre del autor: ");
            author.setFirstName(scanner.nextLine());

            System.out.print("Ingrese el segundo nombre del autor: ");
            author.setSecondName(scanner.nextLine());

            System.out.print("Ingrese el primer apellido del autor: ");
            author.setLastName(scanner.nextLine());
            book.setAuthor(author);

            System.out.print("Ingrese el ISBN del libro: ");
            book.setISBN(scanner.nextLine());

            System.out.print("Ingrese el numero de paginas del libro: ");
            book.setPages(scanner.nextInt());

            System.out.print("Ingrese la edicion del libro: ");
            book.setEdition(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Ingrese la plublicadora del libro: ");
            book.setEditorial(scanner.nextLine());

            System.out.print("Ingrese la ciudad de publicacion: ");
            book.setCity(scanner.nextLine());

            System.out.print("Ingrese el pais de publicacion: ");
            book.setCountry(scanner.nextLine());

            System.out.print("Ingrese la fecha de edicion: ");
            book.setEditionDate(scanner.nextLine());

            library.addBook(book);
            System.out.print("\nDesea agregar un nuevo libro? (s/N): ");
            choice = scanner.next().toLowerCase().charAt(0);
        } while (choice == 's');

    }

    public static void displayBooks(Library library) {
        System.out.println("\n========================");
        System.out.println("LIBROS EN LA BIBLIOTECA.");
        library.getBooks().forEach(book -> {
            System.out.printf("\nTitulo: %s\n", book.getTitle());
            System.out.printf("%da. edición.\n", book.getEdition());
            System.out.printf("Autor: %s\n", book.getAuthor());
            System.out.printf("ISBN: %s\n", book.getISBN());
            System.out.printf("%s, %s (%S), %s\n", book.getEditorial(),
                book.getCity(), book.getCountry(), book.getEditionDate());
            System.out.printf("%d páginas.\n", book.getPages());
        });
    }
}

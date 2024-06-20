package homework02;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        enterBook();
    }

    public static void enterBook() {
        String name;
        String author;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro: ");
        name = input.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        author = input.nextLine();

        showBook(name, author);
    }

    public static void showBook(String name, String author) {
        System.out.println("* BOOK: ");
        System.out.println("-Name: " + name);
        System.out.println("-Author: " + author);
    }

}
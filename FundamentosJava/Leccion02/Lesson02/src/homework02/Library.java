package homework02;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        enterBook();
    }

    public static void enterBook() {
        String name;
        String author;
        int id;
        double price;
        boolean freeShipping;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro: ");
        name = input.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        author = input.nextLine();

        System.out.println("Ingresa el id: ");
        id = Integer.parseInt(input.nextLine());

        System.out.println("Ingresa el precio: ");
        price = Double.parseDouble(input.nextLine());

        System.out.println("Envio gratis: \n1. Gratis\n2. Pago\n");
        int opc =  Integer.parseInt(input.nextLine());
        if (opc == 1) {
            freeShipping = true;
        } else {
            freeShipping = false;
        }

        showBook(name, author, id, price, freeShipping);
    }

    public static void showBook(String name, String author, int id, double price, boolean shipment) {
        System.out.println("* BOOK: ");
        System.out.println("-Name: " + name);
        System.out.println("-Author: " + author);
        System.out.println("-ID: " + id);
        System.out.println("-Price: $" + price);
        System.out.println("-Free shipping: " + shipment);
    }

}
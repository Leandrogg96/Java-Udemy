package test;

import domain.Order;
import domain.Product;

public class AppSale {
    public static void main(String[] args) {
        Product product1 = new Product("Camisa", 50);
        Product product2 = new Product("Reloj", 123);
        Product product3 = new Product("Short", 11);
        Product product4 = new Product("Medias", 7);
        Product product5 = new Product("Zapatos", 99);
        Product product6 = new Product("Traje", 183);

        Order order1 = new Order();
        Order order2 = new Order();

        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);
        order1.addProduct(product4);

        order1.printOrder();

        order2.addProduct(product6);
        order2.addProduct(product5);
        order2.addProduct(product2);

        order2.printOrder();

    }
}
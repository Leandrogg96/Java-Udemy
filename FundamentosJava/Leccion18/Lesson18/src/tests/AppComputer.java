package tests;

import domain.*;

import java.time.Month;

public class AppComputer {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 20);
        Keyboard keyboardHP = new Keyboard("bluetooth", "HP");
        Mouse mouseHP = new Mouse("bluetooth", "HP");

        Computer computerHP = new Computer("Computadora HP", monitorHP, keyboardHP, mouseHP);

        Monitor monitorAsus = new Monitor("Asus", 49);
        Keyboard keyboardAsus = new Keyboard("bluetooth", "Asus");
        Mouse mouseAsus = new Mouse("bluetooth", "Asus");

        Computer computerAsus = new Computer("Computadora Asus", monitorAsus, keyboardAsus, mouseAsus);

        Monitor monitorLenovo = new Monitor("Lenovo", 28);
        Keyboard keyboardLenovo = new Keyboard("bluetooth", "Lenovo");
        Mouse mouseLenovo = new Mouse("bluetooth", "Lenovo");

        Computer computerLenovo = new Computer("Computadora Lenovo", monitorLenovo, keyboardLenovo, mouseLenovo);

        Order order1 = new Order();
        order1.addComputer(computerHP);
        order1.addComputer(computerAsus);

        order1.printOrder();

        Order order2 = new Order();
        order2.addComputer(computerHP);
        order2.addComputer(computerAsus);
        order2.addComputer(computerLenovo);

        order2.printOrder();

        Order order3 = new Order();
        order3.addComputer(computerLenovo);

        order3.printOrder();

    }
}

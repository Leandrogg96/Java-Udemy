package test;

import domain.Animal;

import static domain.Animal.MY_CONSTANT;

public class AppWordFinal {
    public static void main(String[] args) {
        final int myVariable = 10;
        System.out.println("myVariable = " + myVariable);

        System.out.println("MY_CONSTANT = " + MY_CONSTANT);

        final Animal animal1 = new Animal();
        //animal1 = new Animal();

        animal1.setWeight(4124);
        animal1.setType("mamifero");

        System.out.println("animal1 = " + animal1);

        animal1.printAnimal();

        animal1.setWeight(44124);
        animal1.setType("reptil");

        animal1.printAnimal();

    }
}
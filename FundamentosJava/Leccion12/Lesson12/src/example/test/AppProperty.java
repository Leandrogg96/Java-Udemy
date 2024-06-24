package example.test;

import example.domain.Property;

public class AppProperty {
    public static void main(String[] args) {

        Property property1 = new Property("Casa");
        Property property2 = new Property("Departamento");
        System.out.println(property1);
        System.out.println(property2);
        System.out.println("---------------------");
        printAppProperty(property1);
        printAppProperty(property2);


    }

    public static void printAppProperty(Property property) {
        System.out.println(property);
    }

}
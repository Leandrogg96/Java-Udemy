package test;

import domain.Plant;

public class AppArrays {
    public static void main(String[] args) {

        // Primitive array
        int ages[] = new int[3];
        System.out.println("ages = " + ages);

        ages[0] = 1;
        ages[1] = 2;
        ages[2] = 3;
        System.out.println("ages[0] = " + ages[0]);

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Edades: " + ages[i]);
        }

        // Object array
        Plant plants[] = new Plant[3];
        for (int i = 0; i < plants.length; i++) {
            plants[i] = new Plant();
        }
        for (int i = 0; i < plants.length; i++) {
            System.out.println("------ PLANTA ------");
            System.out.println(plants[i].toString());
        }

    }
}
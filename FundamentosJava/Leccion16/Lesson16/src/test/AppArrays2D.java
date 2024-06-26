package test;

import domain.Plant;

public class AppArrays2D {
    public static void main(String[] args) {
        // Primitive array 2 dimension
        System.out.println("------ MATRICES ------");
        int age2[][] = new int[3][2];
        System.out.println("age = " + age2);

        age2[0][0] = 2;
        age2[0][1] = 3;
        age2[1][0] = 561;
        age2[1][1] = 134512;
        age2[2][0] = 1;
        age2[2][1] = 213;

        for (int i = 0; i < age2.length; i++) {
            for (int j = 0; j < age2[i].length; j++) {

                System.out.println("Edades " + i + "-" + j + ": " + age2[i][j]);
            }
        }

        String fruits[][] = {{"orange", "lemon", "grapefruit"}, {"apple", "banana", "watermelon", "strawberry", "kiwi"}};

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {

                System.out.println("Frutas " + i + "-" + j + ": " + fruits[i][j]);
            }
        }

        // Object array 2 dimension

        Plant plant2[][] = new Plant[1][2];

        for (int i = 0; i < plant2.length; i++) {
            for (int j = 0; j < plant2[i].length; j++) {
                plant2[i][j] = new Plant();
            }
        }
        printArray(plant2);
    }

    public static void printArray(Object matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("------ Matriz ------");
                System.out.println("POSICION " + i + "-" + j + ": " + matrix[i][j].toString());
            }
        }
    }

}

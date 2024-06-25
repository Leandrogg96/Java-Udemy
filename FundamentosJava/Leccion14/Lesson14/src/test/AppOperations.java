package test;

import domain.Operations;

public class AppOperations {
    public static void main(String[] args) {
        int result = Operations.add(2,4);
        print(result);

        double result2 = Operations.add(2.4,88);
        print(result2);
    }

    public static void print(int result) {
        System.out.println("result = " + result);
    }

    public static void print(double result) {
        System.out.println("result = " + result);
    }

}
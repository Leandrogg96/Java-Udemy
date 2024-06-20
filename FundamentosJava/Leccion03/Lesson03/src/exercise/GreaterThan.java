package exercise;

import java.util.Scanner;

public class GreaterThan {
    private int number1;
    private int number2;

    public static void main(String args[]) {
        GreaterThan past1 = new GreaterThan();

        past1.comparison();
    }

    public GreaterThan() {
        readNumbers();
    }

    public void readNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        this.number1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese otro numero: ");
        this.number2 = Integer.parseInt(input.nextLine());
    }

    public void comparison() {
        if (getNumber1() > getNumber2()) {
            System.out.println("El numero " + getNumber1() + " es el mayor.");
        } else if (getNumber2() > getNumber1()) {
            System.out.println("El numero " + getNumber2() + " es el mayor.");
        } else {
            System.out.println("Ambos numeros son iguales.");
        }
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}

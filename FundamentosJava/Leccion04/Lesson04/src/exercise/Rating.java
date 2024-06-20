package exercise;

import java.util.Scanner;

public class Rating {
    private int note;

    public static void main(String[] args) {
        Rating note1 = new Rating();
        note1.correction();

    }

    public Rating() {
        readNote();
    }

    public void readNote() {
        System.out.println("Ingresa la nota: ");
        setNote(validationNote());
    }

    public static int validationNote() {
        int result = -1;  // Inicializar con un valor fuera del rango valido
        Scanner input = new Scanner(System.in);
        System.out.println("La nota debe ser un numero entero entre 0 y 10 inclusive.");

        do {
            System.out.print("Ingrese la nota: ");
            // Se usa try-catch para manejar la excepcion en caso de que el usuario ingrese algo que no sea un entero
            try {
                result = Integer.parseInt(input.nextLine());
                if (result < 0 || result > 10) {
                    System.out.println("Nota fuera del rango permitido. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Por favor, ingrese un numero entero.");
            }
        } while (result < 0 || result > 10);

        return result;
    }

    public void correction() {
        switch (getNote()) {
            case 0: case 1 : case 2: case 3: case 4: case 5:
                System.out.println("Tu nota es una 'F'.");
                break;
            case 6:
                System.out.println("Tu nota es una 'D'.");
                break;
            case 7:
                System.out.println("Tu nota es una 'C'.");
                break;
            case 8:
                System.out.println("Tu nota es una 'B'.");
                break;
            case 9: case 10:
                System.out.println("Tu nota es una 'A'.");
                break;
            default:
                System.out.println("Nota invalida.");
        }
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
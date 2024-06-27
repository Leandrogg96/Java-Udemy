package example;

import java.util.Scanner;

public class _03CycleWhileDoWhile {
    public static void main(String args[]) {
        // While
        var contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++;
        }

        // DoWhile
        var contadorII = 0;
        do {
            System.out.println("contadorII = " + contadorII);
            contadorII++;
        } while (contadorII < 3);

        int iterador = 0;
        int limite = 10;
        do {
            System.out.println("contador = " + iterador);
            iterador++;
        } while (contador < limite);

        example01();
    }

    public static void example01() {
        System.out.println("Por favor introduce el número de elementos a iterar:");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in); //Creacion de objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt(); //Leemos el valor proporcionado por el usuario
        int contador = 0;//Inicializamos el contador
        while (contador < maxElementos) {
            System.out.println("contador = " + contador);
            contador++;
        }
    }
}
package example;

import javax.swing.*;

public class Example07 {
    int n;
    int edad[] = new int[n];
    float peso[] = new float[n];
    float medida[] = new float[n];

    public Example07() {
    }

    public Example07(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void llenarEdad() {
        for (int i = 0; i < n; i++) {
            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite Valor de elementos de la posición en el valor [ " + i + " ] = "));
        }
    }

    public void mostraEdad() {
        for (int i = 0; i < n; i++) {
            System.out.println("Edad [ " + i + " ] = " + edad[i]);
        }
    }

    public static void main(String[] args) {
        Example07 obj = new Example07();
        obj.llenarEdad();
    }

}

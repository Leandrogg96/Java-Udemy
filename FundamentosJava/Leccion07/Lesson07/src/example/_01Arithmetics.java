package example;

public class _01Arithmetics {
    private int a;
    private int b;

    public static void main(String[] args) {
        _01Arithmetics arithmetic1 = new _01Arithmetics();
        arithmetic1.a = 21;
        arithmetic1.b = 46;
        System.out.println("-Aritmetica1 a: " + arithmetic1.a);
        System.out.println("-Aritmetica1 b: " + arithmetic1.b);

        _01Arithmetics arithmetic2 = new _01Arithmetics(99);
        arithmetic2.b = 11;
        System.out.println("-Aritmetica2 a: " + arithmetic2.a);
        System.out.println("-Aritmetica2 b: " + arithmetic2.b);

        _01Arithmetics arithmetic3 = new _01Arithmetics(5, 8);
        System.out.println("-Aritmetica3 a: " + arithmetic3.a);
        System.out.println("-Aritmetica3 b: " + arithmetic3.b);

    }

    // Constructor sin argumentos.
    public _01Arithmetics() {
        System.out.println("Ejecutando constuctor sin argumentos.");
    }

    // Constructor con argumentos.
    public _01Arithmetics(int a) {
        this.a = a;
        System.out.println("Ejecutando constuctor con 1 argumento.");
    }
    public _01Arithmetics(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos 2 argumentos.");
    }


}
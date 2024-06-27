package example;

public class _01ArithmeticOperators {
    public static void main(String args[]) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("Resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("Resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("Resultado multiplicacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("Resultado division = " + resultado2);

        resultado = a % b;
        System.out.println("Resultado modulo = " + resultado);

        if( b % 2 == 0)
            System.out.println("Es un numero par");
        else
            System.out.println("Es un numero impar");

    }
}

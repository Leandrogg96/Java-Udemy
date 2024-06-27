package example;

import java.util.Scanner;

public class Example08 {
    public static void main(String args[]) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }

        var edad = 10;

        //var esAdulto = edad >= 18;
        if( edad >= 18 ){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }

        //Convertir tipo String a un tipo int
        var edadII = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edadII + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edadII = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edadII);


        //Convertir tipo String a un tipo int
        var edadIII = Integer.parseInt("20");
        //var edad = "20";
        System.out.println("edad = " + (edadIII + 1));

        var valorNepe = Double.parseDouble("2.78");
        System.out.println("valorE = " + valorNepe);

        //Pedir un valor
        var input = new Scanner(System.in);
        //System.out.println("Proporciona tu edad:");
        //edad = Integer.parseInt( consola.nextLine() );
        //system.out.println("edad = " + edad);

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);


    }
}


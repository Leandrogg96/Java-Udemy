package example;

public class _06ConditionalOperators {
    public static void main(String args[]) {
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = (a >= 0 && a <= 10); // ambas condiciones deben cumplirse simultaneamente para su validez
        if(resultado){
            System.out.println("Dentro de rango");
        }
        else{
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var diaDescanso = true;

        if( vacaciones || diaDescanso){ // basta con que uno sea verdadero para su validez
            System.out.println("Padre puede asisitir al juego del hijo");
        }
        else{
            System.out.println("El padre esta ocupado");
        }

    }
}

package example;

public class _05BreakContinue {
    public static void main(String args[]) {
        for(var contador = 0; contador < 3; contador++) {
            if(contador % 2 != 0) {
                continue;//ir a la siguiente iteracion
            }
            System.out.println("contador = " + contador);
        }

        for(var contador = 0 ; contador < 47 ; contador++) {
            if(contador % 2 == 0) {
               System.out.println("contador = " + contador);
               break;
            }
        }
    }
}
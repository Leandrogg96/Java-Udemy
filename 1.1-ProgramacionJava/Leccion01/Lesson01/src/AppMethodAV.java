public class AppMethodAV {
    public static void main(String[] args) {

        // Methods argument variable

        printNumbers(22,1,4,5,2,1);
        System.out.println("-----------------------------------------");
        printNumbers(4,1,2,78788);

        System.out.println("-----------------------------------------");
        printNumbers("Leandro", 1,321,31,441,51,1);

    }

    private static void printNumbers(int... numbers){
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("# Elemento: " + numbers[i]);
        }

    }

    private static void printNumbers(String name, int... numbers) {
        System.out.println("*Nombre: " + name);
        printNumbers(numbers);
    }

}
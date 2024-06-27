package example;

public class Main {
    public static void main(String[] args) {
        // Pass by value
        var x = 10;
        System.out.println("x = " + x);

        modifyValue(x);

        System.out.println("x nuevo valor = " + x);


        // Pass by reference
        Person person1 = new Person();
        person1.setName("Juan");
        System.out.println("Persona1 nombre: " + person1.getName());
        modifyValue(person1);
        System.out.println("Persona1 cambio nombre: " + person1.getName());

        Person person2 = new Person("Leandro", "Gallac");
        System.out.println("Mi nombre completo es: ");
        person2.printInformation();
        modifyAllValue(person2);
        System.out.println("Mi nombre completo modificado es: ");
        person2.printInformation();
    }

    public static void modifyValue(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }

    public static void modifyValue(Person person){
        person.setName("Karla");
    }

    public static void modifyAllValue(Person person) {
        person.setName("Leandro Gabriel");
        person.setLastName("Gallac Varela");
    }

}
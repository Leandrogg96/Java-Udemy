package domain;

import java.util.Scanner;

public class Plant {
    private int idPlant;
    private String type;
    private String colour;
    private String origin;
    private int age;
    private boolean seed;

    private static int counterPlant;

    public Plant() {
        this.idPlant = Plant.getCounterPlant();
        Plant.setCounterPlant(getCounterPlant()+1);
        readPlant();
    }

    public Plant(String type, String colour, String origin, int age, boolean seed) {
        this.idPlant = Plant.getCounterPlant();
        this.type = type;
        this.colour = colour;
        this.origin = origin;
        this.age = age;
        this.seed = seed;
        Plant.setCounterPlant(getCounterPlant()+1);
    }

    public void readPlant() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el tipo de planta: ");
        this.type = input.nextLine();

        System.out.println("Ingresa el color: ");
        this.colour = input.nextLine();

        System.out.println("Ingresa el lugar de origen: ");
        this.origin = input.nextLine();

        System.out.println("Ingresa la edad: ");
        this.age = input.nextInt();

        input.nextLine();

        System.out.println("Es de semilla: [s: si, n: no]");
        this.seed = input.nextLine().equalsIgnoreCase("s");
    }

    public void printPlant() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSeed() {
        return seed;
    }

    public void setSeed(boolean seed) {
        this.seed = seed;
    }

    public int getIdPlant() {
        return idPlant;
    }

    public void setIdPlant(int idPlant) {
        this.idPlant = idPlant;
    }

    public static int getCounterPlant() {
        return counterPlant;
    }

    public static void setCounterPlant(int counterPlant) {
        Plant.counterPlant = counterPlant;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plant {");
        sb.append("idPlant = ").append(idPlant);
        sb.append(", type = '").append(type).append('\'');
        sb.append(", colour = '").append(colour).append('\'');
        sb.append(", origin = '").append(origin).append('\'');
        sb.append(", age = ").append(age);
        sb.append(", seed = ").append(seed);
        sb.append('}');
        return sb.toString();
    }
}

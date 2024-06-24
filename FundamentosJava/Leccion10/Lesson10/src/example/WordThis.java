package example;

public class WordThis {
    public static void main(String[] args) {

        Animal dog = new Animal("Perro", "Mamifero", 23);
        dog.printAnimal();
        System.out.println("--------------------------");
        System.out.println("-Desde main: ");
        new Print().printClass(dog);
    }
}
class  Animal {
    private String name;
    private String type;
    private double weight;

     public Animal(String name, String type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        System.out.println("-Direccion de objeto animal desde animal: " + this);
        new Print().printClass(this);
    }

    public void printAnimal() {
        System.out.println("--------------------------");
        System.out.println("-Animal: " + getName());
        System.out.println("-Tipo: " + getType());
        System.out.println("-Peso: " + getWeight() + " KG");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}

class Print {
    public Print() {
        super();
    }
    public void printClass(Animal animal) {
        System.out.println("-Direccion de objeto animal desde print: " + animal);
        System.out.println("-Direccion de objeto print: " + this);
    }
}
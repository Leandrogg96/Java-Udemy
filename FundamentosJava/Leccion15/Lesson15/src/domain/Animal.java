package domain;

public final class Animal {
    public final static int MY_CONSTANT = 1;
    protected String type;
    protected double weight;
    
    public final void printAnimal() {
        System.out.println("getType() = " + getType());
        System.out.println("getWeight() = " + getWeight());
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

package example.element;

public class Car {
    private String mark;
    private String model;
    private double price;
    private int year;
    private boolean used;

    public Car() {

    }

    public Car(String mark, String model, double price, int year, boolean used) {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.year = year;
        this.used = used;
    }

    public void printCar() {
        System.out.println("------ AUTO ------");
        System.out.println("- Marca: " + getMark());
        System.out.println("- Modelo: " + getModel());
        System.out.println("- Anio: " + getYear());
        System.out.println("- Precio: " + getPrice());
        System.out.println("- Nuevo: " + !isUsed());
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String toString(){
        return "Auto: [-Marca: " + getMark() +
                      "\n\t   -Modelo: " + getModel() +
                      "\n\t   -Anio: " + getYear() +
                      "\n\t   -Precio: " + getPrice() +
                      "\n\t   -Usado: " + isUsed() + "]";

    }

}

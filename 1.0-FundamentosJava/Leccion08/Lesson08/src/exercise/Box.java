package exercise;

public class Box {
    private int wide;
    private int high;
    private int deep;

    public Box() {
        System.out.println("Constructor vacio.");
    }

    public Box(int wide, int high, int deep) {
        this.wide = wide;
        this.high = high;
        this.deep = deep;
    }

    public void calculateArea() {
        int volume = getDeep()*getHigh()*getWide();
        System.out.println("El volumen de la caja, con las dimensiones que proporcionaste, es: " + volume);
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getDeep() {
        return deep;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }
}

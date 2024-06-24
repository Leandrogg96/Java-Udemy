package exercise;

public class AppBox {
    public static void main(String[] args) {
        Box box2 = new Box();
        box2.setWide(3);
        box2.setHigh(10);
        box2.setDeep(2);
        box2.calculateArea();

        int w = 3;
        int h = 12;
        int d = 7;

        Box box1 = new Box(w,h,d);
        box1.calculateArea();
    }
}
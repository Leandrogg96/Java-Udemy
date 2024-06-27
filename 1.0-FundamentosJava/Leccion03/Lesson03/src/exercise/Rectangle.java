package exercise;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;
    public static void main(String args[]){
        Rectangle rectangle1 = new Rectangle();

        rectangle1.area();
        rectangle1.perimeter();
    }

    public Rectangle() {
        readRectangle();
    }

    public void readRectangle(){
        Scanner input = new Scanner(System.in);

        System.out.println("Proporcione la altura: ");
        this.width = Integer.parseInt(input.nextLine());

        System.out.println("Proporcione el ancho: ");
        this.height = Integer.parseInt(input.nextLine());
    }

    public void area() {
        double resultArea = this.height * this.width;
        System.out.println("El area del rectangulo es: " + resultArea);

    }

    public void perimeter() {
        double resultPerimeter = this.height*2 + this.width*2;
        System.out.println("El perimetro del rectangulo es: " + resultPerimeter);
    }

}

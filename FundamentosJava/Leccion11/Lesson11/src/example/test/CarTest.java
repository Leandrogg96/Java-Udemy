package example.test;
import example.element.Car;
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", "Tiida", 400000, 2010, true);

        car1.printCar();
        System.out.println("------ AUTO ------\n" + car1);

    }
}


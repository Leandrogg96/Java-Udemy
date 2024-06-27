package domain;

import java.util.Arrays;

public class Order {
    private int idOrder;
    private Computer[] computers;
    private static int counterIdOrder;
    private int counterComputer;
    private static final int MAX_COMPUTER = 11;

    public Order() {
        this.idOrder = Order.getCounterIdOrder();
        Order.setCounterIdOrder(getCounterIdOrder()+1);
        this.computers = new Computer[Order.MAX_COMPUTER];
    }

    public void addComputer(Computer computer) {
        if(this.counterComputer < Order.MAX_COMPUTER) {
              this.computers[this.counterComputer++] = computer;
        } else{
            System.out.println("Has superado el limite. [" + Order.MAX_COMPUTER + "]");
        }
    }

    public void printOrder() {
        System.out.println("------ ORDEN DE COMPRA ------");
        System.out.println("-Orden #:" + getIdOrder());
        System.out.println(" *Computadoras de la orden #:" + getIdOrder());
        for (int i = 0; i < getCounterComputer(); i++) {
            System.out.println(getComputers()[i]);
        }
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public static int getCounterIdOrder() {
        return counterIdOrder;
    }

    public static void setCounterIdOrder(int counterIdOrder) {
        Order.counterIdOrder = counterIdOrder;
    }

    public int getCounterComputer() {
        return counterComputer;
    }

    public void setCounterComputer(int counterComputer) {
        this.counterComputer = counterComputer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("idOrder=").append(idOrder);
        sb.append(", computers=").append(Arrays.toString(computers));
        sb.append(", counterOrder=").append(counterIdOrder);
        sb.append(", counterComputer=").append(counterComputer);
        sb.append('}');
        return sb.toString();
    }
}

package domain;

public class Order {
    private final int idOrder;
    private Product products[];
    private static int counterOrder;
    private int counterProducts;
    private static final int MAX_ORDER = 10;


    public Order() {
        this.idOrder = Order.getCounterOrder();
        Order.setCounterOrder(getCounterOrder()+1);
        this.products = new Product[Order.MAX_ORDER];
    }

    public void addProduct(Product product) {
        if(this.counterProducts < Order.MAX_ORDER){
            this.products[this.counterProducts++] = product;
        }
        else {
            System.out.println("Se ha superado el maximo de productos que se pueden agregar " + Order.MAX_ORDER + ".");
        }
    }
    public double calculateTotal() {
        double result = 0;
        for (int i = 0; i < this.counterProducts; i++) {
            Product product = this.products[i];
            result += product.getPrice();
            //result += this.products[i].getPrice();
        }
        return result;
    }

    public void printOrder() {
        System.out.println("* ID-Orden: " + this.idOrder);
        System.out.println("* Total de la orden: $" + this.calculateTotal());
        System.out.println("* Productos de la orden: ");
        printProduct(this.products, this.counterProducts);
    }

    public void printProduct(Product products[], int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println(products[i]);
        }
    }

    public int getIdOrder() {
        return idOrder;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProduct(Product[] products) {
        this.products = products;
    }

    public static int getCounterOrder() {
        return counterOrder;
    }

    public static void setCounterOrder(int counterOrder) {
        Order.counterOrder = counterOrder;
    }

    public int getMAX_ORDER() {
        return MAX_ORDER;
    }

    public int getCounterProducts() {
        return counterProducts;
    }

    public void setCounterProducts(int counterProducts) {
        this.counterProducts = counterProducts;
    }
}

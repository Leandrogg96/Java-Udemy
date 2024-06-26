package domain;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int counterProduct;

    private Product() {
        this.idProduct = Product.getCounterProduct();
        Product.setCounterProduct(getCounterProduct()+1);
    }

    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCounterProduct() {
        return counterProduct;
    }

    public static void setCounterProduct(int counterProduct) {
        Product.counterProduct = counterProduct;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}

package example.domain;

public class Property {
    private int idProperty;
    private String type;
    private static int counterProperty;

    public Property(String type) {
        this.idProperty =  Property.getCounterProperty();
        this.type = type;
        //incrementar el contador
        Property.setCounterProperty(getCounterProperty()+1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Property{");
        sb.append("idProperty = ").append(idProperty);
        sb.append(", type = '").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getIdProperty() {
        return idProperty;
    }

    public void setIdProperty(int idProperty) {
        this.idProperty = idProperty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCounterProperty() {
        return counterProperty;
    }

    public static void setCounterProperty(int counterProperty) {
        Property.counterProperty = counterProperty;
    }
}

package domain;

public class Mouse extends InputDevice {
    private int idMouse;
    private static int counterIdMouse;

    public Mouse() {
    }

    public Mouse(String typeInput, String mark) {
        super(typeInput, mark);
        this.idMouse = Mouse.getCounterIdMouse();
        Mouse.setCounterIdMouse(getCounterIdMouse()+1);
    }

    public int getIdMouse() {
        return idMouse;
    }

    public static int getCounterIdMouse() {
        return counterIdMouse;
    }

    public static void setCounterIdMouse(int counterIdMouse) {
        Mouse.counterIdMouse = counterIdMouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}

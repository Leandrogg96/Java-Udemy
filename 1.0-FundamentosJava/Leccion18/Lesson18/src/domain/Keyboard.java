package domain;

public class Keyboard extends InputDevice {
    private int idKeyboard;
    private static int counterIdKeyboard;

    public Keyboard() {
    }

    public Keyboard(String typeInput, String mark) {
        super(typeInput, mark);
        this.idKeyboard = Keyboard.getCounterIdKeyboard();
        Keyboard.setCounterKeyboard(getCounterIdKeyboard()+1);
    }

    public int getIdKeyboard() {
        return idKeyboard;
    }

    public void setIdKeyboard(int idKeyboard) {
        this.idKeyboard = idKeyboard;
    }

    public static int getCounterIdKeyboard() {
        return counterIdKeyboard;
    }

    public static void setCounterKeyboard(int counterIdKeyboard) {
        Keyboard.counterIdKeyboard = counterIdKeyboard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("idKeyboard=").append(idKeyboard);
        sb.append(", counterKeyboard=").append(counterIdKeyboard);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}

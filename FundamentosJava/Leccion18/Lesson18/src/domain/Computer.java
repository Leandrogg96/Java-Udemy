package domain;

public class Computer {
    private int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int counterIdComputer;

    public Computer() {
        this.idComputer = Computer.getCounterIdComputer();
        Computer.setCounterIdComputer(getCounterIdComputer()+1);
    }

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this();
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public void setIdComputer(int idComputer) {
        this.idComputer = idComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static int getCounterIdComputer() {
        return counterIdComputer;
    }

    public static void setCounterIdComputer(int counterIdComputer) {
        Computer.counterIdComputer = counterIdComputer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("idComputer=").append(idComputer);
        sb.append(", name='").append(name).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }
}

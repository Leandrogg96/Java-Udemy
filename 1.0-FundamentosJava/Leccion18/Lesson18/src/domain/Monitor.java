package domain;

public class Monitor {
    private final int idMonitor;
    private String mark;
    private double size;
    private static int counterIdMonitor;

    public Monitor() {
        this.idMonitor = Mouse.getCounterIdMouse();
        Monitor.setCounterIdMonitor(getCounterIdMonitor()+1);
    }

    public Monitor(String mark, double size) {
        this();
        this.mark = mark;
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static int getCounterIdMonitor() {
        return counterIdMonitor;
    }

    public static void setCounterIdMonitor(int counterIdMonitor) {
        Monitor.counterIdMonitor = counterIdMonitor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", mark='").append(mark).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}

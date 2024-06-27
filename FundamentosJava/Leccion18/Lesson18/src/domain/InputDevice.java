package domain;

public class InputDevice {
    private String typeInput;
    private String mark;

    public InputDevice() {
    }

    public InputDevice(String typeInput, String mark) {
        this.typeInput = typeInput;
        this.mark = mark;
    }

    public String getTypeInput() {
        return typeInput;
    }

    public void setTypeInput(String typeInput) {
        this.typeInput = typeInput;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InputDevice{");
        sb.append("typeInput='").append(typeInput).append('\'');
        sb.append(", mark='").append(mark).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

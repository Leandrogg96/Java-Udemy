package domain;

import java.util.Date;

public class Client extends Person {
    private int idClient;
    private boolean vip;
    private Date dateRegistration;
    private static int counterClient;

    public Client(boolean vip, Date dateRegistration) {
        this.idClient = Client.getCounterClient();
        this.vip = vip;
        this.dateRegistration = dateRegistration;
        Client.setCounterClient(getCounterClient()+1);
    }

    public Client(String name, String lastName, char gender, int age, boolean vip, Date dateRegistration) {
        super(name, lastName, gender, age);
        this.idClient = Client.getCounterClient();
        this.vip = vip;
        this.dateRegistration = dateRegistration;
        Client.setCounterClient(getCounterClient()+1);
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public static int getCounterClient() {
        return counterClient;
    }

    public static void setCounterClient(int counterClient) {
        Client.counterClient = counterClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", vip=").append(vip);
        sb.append(", dateRegistration=").append(dateRegistration);
        sb.append(", name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

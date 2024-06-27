package domain;

public class Employee extends Person {
    private int idEmployee;
    private double salary;
    private static int counterEmployee;

    public Employee(String name, double salary) {
        super(name);
        this.idEmployee = getCounterEmployee();
        this.salary = salary;
        Employee.setCounterEmployee(getCounterEmployee()+1);
    }

    public Employee(String name, String lastName, char gender, int age, int idEmployee, double salary) {
        super(name, lastName, gender, age);
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCounterEmployee() {
        return counterEmployee;
    }

    public static void setCounterEmployee(int counterEmployee) {
        Employee.counterEmployee = counterEmployee;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("idEmployee=").append(idEmployee);
        sb.append(", salary=").append(salary);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

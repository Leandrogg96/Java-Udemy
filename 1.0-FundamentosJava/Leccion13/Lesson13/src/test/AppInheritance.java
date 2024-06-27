package test;

import domain.Client;
import domain.Employee;

import java.util.Date;

public class AppInheritance {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Leandro", 30000);
        Employee employee2 = new Employee("Julieta", 60000);

        System.out.println("employee1 = " + employee1);
        System.out.println("employee2 = " + employee2);

        System.out.println("-----------------------------------------------------------------------------------------");

        Client client1 = new Client("Gabriel", "Gallac", 'M', 28, true, new Date());
        Client client2 = new Client("Julieta", "Alegre", 'F', 30, false, new Date());
        System.out.println("client1 = " + client1);
        System.out.println("client2 = " + client2);
    }
}
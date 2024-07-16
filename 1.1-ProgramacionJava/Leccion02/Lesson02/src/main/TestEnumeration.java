package main;

import enumeration.Continent;
import enumeration.Day;

public class TestEnumeration {
    public static void main(String[] args) {
        indicateDayWeek(Day.MONDAY);
        indicateDayWeek(Day.SUNDAY);

        System.out.println("-----------------------------------");

        printNumberCountries(Continent.AFRICA);
        printNumberCountries(Continent.ASIA);


    }

    private static void indicateDayWeek(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("First day of the week.");
            case THURSDAY -> System.out.println("Second day of the week.");
            case WEDNESDAY -> System.out.println("Third day of the week.");
            case TUESDAY -> System.out.println("Fourth day of the week.");
            case FRIDAY -> System.out.println("Fifth day of the week.");
            case SATURDAY -> System.out.println("Sixth day of the week.");
            case SUNDAY -> System.out.println("Last day of the week.");
            default -> System.out.println("It is not a weekday.");
        }
    }

    private static void printNumberCountries(Continent continent) {
        System.out.println("The number of countries on the continent that you selected is: " + continent.getNumberCountries());
    }
}

package Exercises;
import java.util.Locale;

public class Exercise1 {

    public static void main(String[] args) {

        String p1 = "Computer";
        String p2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", p1, price1);
        System.out.printf("%s, which price is $%.2f%n%n", p2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
    
}

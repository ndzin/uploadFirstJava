package Exercises;
import java.util.Locale;
import java.util.Scanner;


public class Exercise5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Type the sus password:");
        
        Scanner sc = new Scanner(System.in);
        double num;

        num = sc.nextDouble();

        System.out.println("Correct password, you typed "+num+".");


       sc.close();

    }


}
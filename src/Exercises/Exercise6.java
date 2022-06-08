package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        System.out.println("Type the sus key:");
        
        Scanner sc = new Scanner(System.in);
        char key;

        key = sc.next().charAt(0);

        System.out.println("Correct key, you typed "+key+".");


       sc.close();

    }
    

}
package Exercises;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        System.out.println("Type the sus password:");
        
        Scanner sc = new Scanner(System.in);
        String password;

        password = sc.next();

        System.out.println("Correct password, you typed "+password);


       sc.close();

    }


}
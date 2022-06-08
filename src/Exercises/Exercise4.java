package Exercises;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        System.out.println("Type the sus password:");
        
        Scanner sc = new Scanner(System.in);
        int num;

        num = sc.nextInt();

        System.out.println("Correct password, you typed "+num+".");


       sc.close();

    }


}
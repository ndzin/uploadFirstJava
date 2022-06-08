package Exercises;
import java.util.Locale;
import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        System.out.println("Type the sus pattern:");
        
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
    
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
    

        System.out.println("Correct, you typed:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

       sc.close();

    }
    

}
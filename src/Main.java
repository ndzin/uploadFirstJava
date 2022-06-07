import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int idade = 25;
        double altura = 1.624218;
        char sexo = 'F';

        System.out.println("Olá Mundo!");
        System.out.printf("%.2f%n", altura);
        System.out.printf("%.4f%n", altura);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", altura);
        System.out.printf("A sua altura é: %.2f metros%n", altura);
        
    
    }
}
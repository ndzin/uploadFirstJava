import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String nome = "Nathan";
        int idade = 18;
        double renda = 4000.0;

        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha R$ %.2f.%n", nome, idade, renda);
        
    
    }
}

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int x = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= x; i++) {
            fatorial *= i;
        }

        System.out.printf("O fatorial do número %d é %d!", x, fatorial);

        sc.close();
    }
}

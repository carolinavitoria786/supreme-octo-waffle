package program;

import contas.Contas;
import java.util.Locale;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 3;
        Contas conta = new Contas();
        Contas[] vect = new Contas[n];

        for (int i = 0; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            vect[i].maiorDTres(x, y, z);
        }


    }
    
}

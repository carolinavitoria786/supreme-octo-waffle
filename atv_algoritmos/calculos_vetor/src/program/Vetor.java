package program;

import contas.Contas;
import java.util.Locale;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Contas conta = new Contas();

        System.out.println("Digite um valor para x: ");
        int x = sc.nextInt();

        System.out.println("Digite um valor para y: ");
        int y = sc.nextInt();

        System.out.println("Digite um valor para z: ");
        int z = sc.nextInt();

        System.out.println("Sobre os valores digitados temos que: ");
        conta.maiorDTres(x, y, z);
        conta.menorDTres(x, y, z);
        conta.dentroInter(x, y, z);
        conta.div(x, y, z);


        sc.close();
    }

}

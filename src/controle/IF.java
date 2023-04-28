package controle;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = scanner.nextDouble();

        if(media >= 7.0) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        if(media < 7 && media >= 5) {
            System.out.println("Recuperacao!");
        }

        if(media < 4.5 && media >= 0) {
            System.out.println("Reprovado!");
        }
    }
}

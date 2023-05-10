package array;

import java.util.Arrays;
import java.util.Scanner;

public class desafioArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas deseja informar? ");

        int qtdNotas = scanner.nextInt();

        double notas[] = new double[qtdNotas];

        double soma = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.print("Notas = ");

        System.out.println(Arrays.toString((notas)));

        System.out.println("Media = " + media);

        scanner.close();
    }
}

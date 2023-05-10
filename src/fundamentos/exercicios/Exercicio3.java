package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(scanner.next());

        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(scanner.next());

        double imc = peso / Math.pow(altura,2);

        System.out.println("IMC = " + imc);

        scanner.close();
    }
}

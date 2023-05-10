package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double resultadoConversao = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura %.2f fahrenheit em graus celsius é = %.2f", fahrenheit, resultadoConversao);

    }
}

package fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        double celsius = entrada.nextDouble();

        double resultadoConversao = (celsius * 1.8) + 32;
        System.out.printf("O resultado da conversao de %.2f celsius para fahrenheit = %.2f", celsius, resultadoConversao);
    }
}

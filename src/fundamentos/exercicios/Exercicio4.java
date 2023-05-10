package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double valor = scanner.nextDouble();

        double resultadoQuadrado = Math.pow(valor,2);
        double resultadoCubo = Math.pow(valor,3);

        System.out.println("Resultado do quadrado do valor = " + resultadoQuadrado);
        System.out.println("Resultado do cubo do valor = " + resultadoCubo);

    }
}

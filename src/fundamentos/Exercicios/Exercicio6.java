package fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor de c: ");
        int c = scanner.nextInt();

        double delta = Math.pow(b,2) - (4 * a * c);

        double x1 = (-b + Math.sqrt(delta)) / (a * 2);
        double x2 = (-b - Math.sqrt(delta)) / (a * 2);

        System.out.println("Resultado do x1 = " + x1);
        System.out.println("Resultado do x2 = " + x2);

    }
}

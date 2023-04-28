package fundamentos.Exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        double base = scanner.nextInt();

        System.out.println("Digite o valor da altura: ");
        double altura = scanner.nextDouble();

        double areaTriangulo = base * altura;

        System.out.println("A area do triangulo = " + areaTriangulo);


    }
}

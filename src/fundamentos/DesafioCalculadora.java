package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        // Ler num1
        // Ler num2
        // + - * / %
        // operacao num1 num2

        double num1 = 0;
        double num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        String operacao;
        System.out.println("Informe a operacao desejada: ");
        operacao = scanner.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;


        System.out.printf("%.2f %s %.2f = %.2f", num1,operacao,num2,resultado);

        scanner.close();




    }
}

package controle.Exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        double numero;

        do {
            System.out.println("Digite um numero: ");
            numero = scanner.nextDouble();

            if (numero > 0) {
                soma += numero;
                System.out.println("Soma = " + soma);
            }else if(numero < 0){
                System.out.println("ENCERRANDO...");
            }
        } while (numero > 0);

        scanner.close();
    }
}

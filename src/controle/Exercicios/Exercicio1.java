package controle.Exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        if(numero >= 0 && numero <= 10){
            if(numero % 2 == 0){
                System.out.println("Par!");
            }else{
                System.out.println("Impar!");
            }
        }else{
            System.out.println("Numero fora do intervalo [0:10]");
        }

        scanner.close();
    }
}

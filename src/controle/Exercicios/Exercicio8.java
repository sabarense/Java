package controle.Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int tamanho = palavra.length();

        for(int i = 0; i < tamanho; i++){
            System.out.println(palavra.charAt(i));
        }

        scanner.close();
    }
}

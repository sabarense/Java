package controle.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7){
            System.out.println("Sua média foi " + media + " e voce está aprovado!");
        }else if(media >= 4){
            System.out.println("Sua média foi " + media +  " e voce está de recuperacao!");
        }else{
            System.out.println("Sua média foi " + media +  " e voce está reprovado!");
        }

        scanner.close();
    }
}

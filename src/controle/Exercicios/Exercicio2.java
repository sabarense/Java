package controle.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int anoAtual = scanner.nextInt();

        boolean bissexto = anoAtual % 4 == 0 && anoAtual % 100 != 0 || anoAtual % 400 == 0;

        if(bissexto == true){
            System.out.println(anoAtual + "é bissexto!");
        }else{
            System.out.println(anoAtual + "não é bissexto!");
        }
        scanner.close();
    }
}

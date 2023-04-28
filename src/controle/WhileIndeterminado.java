package controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra = "";

        while(!palavra.equalsIgnoreCase("sair")){
            System.out.println("Você diz: ");
            palavra = scanner.nextLine();
            System.out.println(palavra);
        }

        scanner.close();
    }
}

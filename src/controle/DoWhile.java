package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String texto = "";

        do{
            System.out.println("Você precisa falar " + "as palavras mágicas...");
            System.out.println("Caso queira encerrar o programa, digite por favor" );
            texto = scanner.nextLine();
            System.out.println(texto);
            if(texto.equalsIgnoreCase("por favor")){
                System.out.println("Saindo...");
            }
        }while(!texto.equalsIgnoreCase("por favor"));

        scanner.close();
    }
}

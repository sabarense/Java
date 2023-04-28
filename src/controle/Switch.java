package controle;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor de faixa desejada: ");
        String faixa = scanner.next();

        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Sabe sobre a faixa preta");
                break;
            case "marrom":
                System.out.println("Sabe sobre a faixa marrom");
                break;
            case "roxa":
                System.out.println("Sabe sobre a faixa roxa");
                break;
            case "verde":
                System.out.println("Sabe sobre a faixa verde");
                break;
            case "laranja":
                System.out.println("Sabe sobre a faixa laranja");
                break;
            case "vermelha":
                System.out.println("Sabe sobre a faixa vermelha");
                break;
            case "amarela":
                System.out.println("Sabe sobre a faixa amarela");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

        scanner.close();

    }
}

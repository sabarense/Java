package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro salario: ");
        String salarioA = entrada.next().replace(",",".");

        System.out.println("Digite o segundo salario: ");
        String salarioB = entrada.next().replace(",",".");

        System.out.println("Digite o terceiro salario: ");
        String salarioC = entrada.next().replace(",",".");

        double valor1 = Double.parseDouble(salarioA);
        double valor2 = Double.parseDouble(salarioB);
        double valor3 = Double.parseDouble(salarioC);

        double soma = valor1 + valor2 + valor3;

        double media = soma / 3;

        System.out.println("A media dos salarios é " + media);

        entrada.close();
    }
}

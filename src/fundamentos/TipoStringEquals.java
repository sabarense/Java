package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {

        String s1 = new String ("2");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        String s2 = teclado.next();

        System.out.println("2" == s2.trim());
        System.out.println("2".equals((s2.trim())));

        teclado.close();
    }
}

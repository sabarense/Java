package fundamentos.types;

public class TipoString {

    public static void main(String[] args) {
        String s = "Boa tarde";

        System.out.println(s.concat("!!!"));

        System.out.println(s.startsWith("Boa"));

        System.out.println(s.toLowerCase().startsWith("boa"));

        System.out.println(s.toUpperCase().endsWith("TARDE"));

        System.out.println(s.length());

        System.out.println(s.toLowerCase().equals("boa tarde"));

        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 5000.400;

        System.out.printf("O senhor %s %s tem %d anos e recebe R$%.2f.", nome, sobrenome, idade, salario);
    }
}

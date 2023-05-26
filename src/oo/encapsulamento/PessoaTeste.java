package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Yan", "Sabarense", 20);
        System.out.println(p1.toString());
        System.out.println(p1.getNomeCompleto());

    }
}

package classe.Desafio;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.250);
        Comida c2 = new Comida("Carne", 0.150);

        Pessoa p = new Pessoa("Yan", 67.5);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());
    }
}

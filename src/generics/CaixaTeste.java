package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        System.out.println("Caixa A:");
        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        System.out.println("Caixa B:");
        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}

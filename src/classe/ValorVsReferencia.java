package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribuicao por valor (Tipo primitivo)
        //a++;  3
        //a--;  1

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // atriuicao por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2025;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}

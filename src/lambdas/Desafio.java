package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;
public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * ( 1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;

        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;

        Function<Double, String> arredondar =
                preco -> (String.format("%.2f", preco));

        Function<String, String> formatar =
                preco -> ("R$" + preco).replace(".",",");


        Produto produto = new Produto("iPad", 3235.89, 0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(produto);

        System.out.println("O preco final e " + preco);
    }
}


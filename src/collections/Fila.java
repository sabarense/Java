package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add ≥ Adicionam elemento na fila
        // Diferenca é o comportamento quando a fila está cheia
        fila.add("Ana");
        fila.offer("Bia"); // Lanca uma excecao
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // fila.size() tamanho da queue
        // fila.clear(); limpa a queue
        // fila.isEmpty() verifica se a lista esta vazia

        // Pool e Remove ≥ obter o próximo elemento da fila e remove

        // Peek e Element -> obter o proximo elemento (sem remover)

        // Diferenca ocorre quando a fila esta vazia
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // lanca uma excecao

    }


}

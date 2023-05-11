package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

//        livros.add("O Pequeno Príncipe");
//        livros.push("Dom Quixote");
//        livros.push("O Hobbit");
//
//
//        for(String livro: livros){
//            System.out.println(livro);
//        }
//
//        System.out.println(livros.peek());
//        System.out.println(livros.element());
//
//        System.out.println(livros.pop());
//        System.out.println(livros.poll());
//        System.out.println(livros.poll());

        Stack<Number> pilha = new Stack<>();

        Random random = new Random();

        for(int i = 0; i < 5; i++){
            System.out.println("Inserindo na pilha: " + pilha.push(random.nextInt(100)));
        }

        for (int i=0; i < 5; i++) {
            System.out.println("Retirando da pilha: " + pilha.pop());
        }
    }
}

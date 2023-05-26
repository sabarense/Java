package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Lucca", "Ana");
        System.out.println("Usando forEach...");

        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("Usando iterator...");
        Iterator<String> iterator = aprovados.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Usando Stream...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno!!
    }
}

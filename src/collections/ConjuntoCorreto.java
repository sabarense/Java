package collections;

import java.util.HashSet;

public class ConjuntoCorreto {

    public static void main(String[] args) {

        HashSet<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Lucca");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }
    }
}

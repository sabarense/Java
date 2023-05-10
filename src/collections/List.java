package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class List {

    public static void main(String[] args) {

        ArrayList<Usuario> list = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        list.add(u1);

        list.add(new Usuario("Yan"));
        list.add(new Usuario("Lucas"));
        list.add(new Usuario("Carlos"));

        System.out.println(list.get(2).nome);

        for(Usuario u: list){
            System.out.println(u.toString());
        }
    }
}

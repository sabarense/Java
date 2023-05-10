package collections;

import java.util.HashSet;

public class Conjunto {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto);
        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.contains('x'));

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(nums.size());

        conjunto.addAll(nums); // Uniao entre dois conjuntos
        System.out.println(conjunto);

        conjunto.retainAll((conjunto)); // Apenas elementos em comum
        conjunto.clear();
        System.out.println(conjunto);
    }
}

package fundamentos.types;

public class TypeCasting {

    public static void main(String[] args) {

        double a = 1; // implicita
        System.out.println(a);

        float b = (float) 1.123456788888; // explicita (cast)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // explicita (cast)
        System.out.println(d);

        double e = 1;
        int f = (int) e; // explicita (cast)
        System.out.println(f);
    }
}

package fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;

        Integer i = Integer.parseInt("10000"); //int
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s);
        System.out.println(i*3);
        System.out.println(l/3);

        Boolean bool = Boolean.parseBoolean("true");
        System.out.println(bool);
        System.out.println(bool.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}

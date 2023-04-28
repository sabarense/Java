package fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {
        int num1 = 10000;
        System.out.println(String.valueOf(num1).length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        System.out.println(("" + num1).length());
    }
}

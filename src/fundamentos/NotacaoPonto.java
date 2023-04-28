package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s = "Boa tarde";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);

        String x = "Bom dia, Leo!".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X".replace("X", "Yan").toUpperCase().concat("!!!");
        System.out.println(y);

        //Tipos primitivos NAO tem o operador "."
    }
}

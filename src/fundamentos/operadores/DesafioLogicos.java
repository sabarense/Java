package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        //Trabalho na terça ( V OU F)
        //Trabalho na quinta ( V OU F)

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTV50 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;

        System.out.println("Comprou TV50?" + comprouTV50);
        System.out.println("Comprou TV32?" + comprouTV32);
    }

}

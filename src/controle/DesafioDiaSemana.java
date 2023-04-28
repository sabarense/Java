package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana:");
        String diaDaSemana = scanner.next();

        if(diaDaSemana.equalsIgnoreCase("domingo")){
            System.out.println(1);
        }else if(diaDaSemana.equalsIgnoreCase("segunda")){
            System.out.println(2);
        }else if(diaDaSemana.equalsIgnoreCase("terça") || diaDaSemana.equalsIgnoreCase("terca")) {
            System.out.println(3);
        }else if(diaDaSemana.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        }else if(diaDaSemana.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        }else if(diaDaSemana.equalsIgnoreCase("sexta")){
            System.out.println(6);
        }else if(diaDaSemana.equalsIgnoreCase("sábado") || diaDaSemana.equalsIgnoreCase("sabado")){
            System.out.println(7);
        }else{
            System.out.println("Dia inválido");
        }
        scanner.close();
    }
}

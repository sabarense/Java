package array;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = scanner.nextInt();

        double notasDaTurma[][] = new double[qtdAlunos][qtdNotas];

        double total = 0;

        for(int aluno = 0; aluno < notasDaTurma.length; aluno++){
            for(int notas = 0; notas < notasDaTurma[aluno].length; notas++){
                System.out.printf("Informe a nota %d do aluno %d:\n" +
                        "", notas + 1, aluno + 1);
                notasDaTurma[aluno][notas] = scanner.nextDouble();
                total += notasDaTurma[aluno][notas];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Media = " + media);
        scanner.close();
    }
}

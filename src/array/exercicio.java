package array;

import java.util.Arrays;

public class exercicio {

    public static void main(String[] args) {

        double notasAlunoA[] = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double somaAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++){
            somaAlunoA += notasAlunoA[i];
        }
        System.out.println(somaAlunoA/notasAlunoA.length);

        double notasAlunoB[] = {6.9, 8.9, 5.5, 10.0};

        double somaAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            somaAlunoB += notasAlunoB[i];
        }
        System.out.println(somaAlunoB/notasAlunoB.length);
    }
}

package lista04;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        double[] resultado = new double[15];
        int i, maior = Integer.MIN_VALUE;

        for (i = 0; i < 15; i++) {
            vetor[i] = scanner.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        for (i = 0; i < 15; i++) {
            resultado[i] = (double) vetor[i] / maior;
        }

        for (i = 0; i < 15; i++) {
            System.out.printf("%.2f ", resultado[i]);
        }

    }
}

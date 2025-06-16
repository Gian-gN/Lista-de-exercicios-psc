package lista04;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] mult = new int[10];
        double[] div = new double[10];
        int i;

        System.out.println("Digite 10 valores para o vetor A:");
        for (i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 valores para o vetor B:");
        for (i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        for (i = 0; i < 10; i++) {
            mult[i] = A[i] * B[i];
            if (B[i] != 0) {
                div[i] = (double) A[i] / B[i];
            } else {
                div[i] = 0;
            }
        }

        System.out.println("\nResultado das multiplicações:");
        for (i = 0; i < 10; i++) {
            System.out.print(mult[i] + " ");
        }

        System.out.println("\n\nResultado das divisões:");
        for (i = 0; i < 10; i++) {
            System.out.printf("%.2f ", div[i]);
        }

    }
}

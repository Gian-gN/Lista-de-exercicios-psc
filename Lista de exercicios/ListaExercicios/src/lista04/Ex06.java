package lista04;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int i;

        System.out.println("Digite 5 valores para o vetor A:");
        for (i = 0; i < 5; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 valores para o vetor B:");
        for (i = 0; i < 5; i++) {
            B[i] = scanner.nextInt();
        }

        for (i = 0; i < 5; i++) {
            C[i] = B[4 - i] - A[i];
        }

        System.out.println("Vetor resultado da subtração acumulada:");
        for (i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

    }
}

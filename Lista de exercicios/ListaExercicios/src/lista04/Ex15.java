package lista04;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int i;

        System.out.println("Digite 10 numeros inteiros:");

        for (i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.println("Vetor alterado:");
        for (i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}

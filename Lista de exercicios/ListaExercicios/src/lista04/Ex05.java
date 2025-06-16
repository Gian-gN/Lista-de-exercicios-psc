package lista04;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int i, j = 0;

        for (i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da posicao " + i + ": ");
            vetorA[i] = scanner.nextInt();

            if (vetorA[i] > 0) {
                vetorB[j] = vetorA[i];
                j++;
            }
        }

        System.out.println("Vetor compactado:  ");
        for (i = 0; i < j; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}

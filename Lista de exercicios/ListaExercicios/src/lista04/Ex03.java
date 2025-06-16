package lista04;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[500];
        int i;

        for (i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor da posicao " + i + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números positivos:");
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("Posicao " + i + ": " + vetor[i]);
            }
        }

    }
}

package lista04;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int i, soma = 0, quantidade = 0;
        double media;

        System.out.println("Digite 15 numeros inteiros:");

        for (i = 0; i < 15; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        media = (double) soma / 15;

        System.out.printf("\nMedia dos valores: %.2f\n", media);
        System.out.println("valores abaixo da média:");

        for (i = 0; i < 15; i++) {
            if (vetor[i] < media) {
                System.out.println("Posicao " + i + ": " + vetor[i]);
                quantidade++;
            }
        }

        if (quantidade == 0) {
            System.out.println("Nenhum valor abaixo da mdia.");
        }

    }
}

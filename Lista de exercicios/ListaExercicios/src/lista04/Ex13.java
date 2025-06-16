package lista04;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int i, numero, encontrados = 0;

        System.out.println("Digite 10 numeros inteiros:");

        for (i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("\nDigite um numero para buscar no vetor: ");
        numero = scanner.nextInt();

        for (i = 0; i < 10; i++) {
            if (vetor[i] == numero) {
                System.out.println("Encontrado na posicao: " + i);
                encontrados++;
            }
        }

        if (encontrados == 0) {
            System.out.println("O número nao esta no vetor.");
        }

    }
}

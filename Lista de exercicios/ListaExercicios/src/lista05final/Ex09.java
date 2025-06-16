
package lista05final;

import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 numeros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            vetorA[i] = scanner.nextInt();
        }

        System.out.println("Digite 10 numeros para o vetor B:");
        for (int i = 0; i < 10; i++) {
            vetorB[i] = scanner.nextInt();
        }

        unirVetores(vetorA, vetorB);

    }

    public static void unirVetores(int[] A, int[] B) {
        int[] uniao = new int[20];
        for (int i = 0; i < 10; i++) {
            uniao[i] = A[i];
            uniao[i + 10] = B[i];
        }

        System.out.println("Vetor uniao:");
        for (int i = 0; i < 20; i++) {
            System.out.print(uniao[i] + " ");
        }
    } 
}

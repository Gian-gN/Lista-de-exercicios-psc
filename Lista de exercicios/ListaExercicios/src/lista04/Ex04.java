package lista04;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorOriginal = new int[30];
        int[] vetorAlterado = new int[30];
        int i;

        for (i = 0; i < vetorOriginal.length; i++) {
            System.out.print("Digite o valor da posicao " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();

            if (vetorOriginal[i] == 0) {
                vetorAlterado[i] = 1;
            } else {
                vetorAlterado[i] = vetorOriginal[i];
            }
        }

        System.out.println("Vetor Original:");
        for (i = 0; i < vetorOriginal.length; i++) {
            System.out.print(vetorOriginal[i] + " ");
        }

        System.out.println("\nVetor Alterado:");
        for (i = 0; i < vetorAlterado.length; i++) {
            System.out.print(vetorAlterado[i] + " ");
        }

    }
}


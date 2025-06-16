package lista04;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int i, j;
        boolean primo;

        for (i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (i = 0; i < 10; i++) {
            if (vetor[i] > 1) {
                primo = true;
                for (j = 2; j <= vetor[i] / 2; j++) {
                    if (vetor[i] % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println("Primo: " + vetor[i] + " na posicao " + i);
                }
            }
        }

    }
}

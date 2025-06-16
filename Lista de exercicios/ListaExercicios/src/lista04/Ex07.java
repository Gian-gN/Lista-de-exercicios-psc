package lista04;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[15];
        int[] primos = new int[15];
        int i, j, contPrimos = 0;
        boolean ehPrimo;

        for (i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] > 1) {
                ehPrimo = true;
                for (j = 2; j <= vetor[i] / 2; j++) {
                    if (vetor[i] % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    primos[contPrimos] = vetor[i];
                    contPrimos++;
                }
            }
        }

        for (i = 0; i < contPrimos; i++) {
            System.out.print(primos[i] + " ");
        }

    }
}

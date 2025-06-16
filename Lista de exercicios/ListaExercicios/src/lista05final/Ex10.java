
package lista05final;

import java.util.Scanner;
public class Ex10 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];
        long[] B;

        System.out.println("Digite 10 numeros inteiros para o vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }

        B = calcularFatoriais(A);

        System.out.println("Vetor B (fatoriais):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Fatorial de " + A[i] + " = " + B[i]);
        }


    }

    public static long[] calcularFatoriais(int[] A) {
        long[] B = new long[10];
        for (int i = 0; i < A.length; i++) {
            B[i] = 1;
            for (int j = 1; j <= A[i]; j++) {
                B[i] *= j;
            }
        }
        return B;
    }  
}

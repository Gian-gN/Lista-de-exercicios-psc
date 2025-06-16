package lista05final;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int soma;

        System.out.println("Digite os 25 elementos da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        soma = somarMatriz(matriz);

        System.out.println("Soma dos elementos da matriz: " + soma);

        scanner.close();
    }

    public static int somarMatriz(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}

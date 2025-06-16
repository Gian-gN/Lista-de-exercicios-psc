package lista04;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int i, somaPares = 0, contImpares = 0;

        System.out.println("Digite 6 numeros:");
        for (i = 0; i < 6; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números pares:");
        for (i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                somaPares += numeros[i];
            }
        }

        System.out.println("\nSoma dos pares: " + somaPares);

        System.out.println("Números ímpares:");
        for (i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
                contImpares++;
            }
        }

        System.out.println("\nQuantidade de ímpares: " + contImpares);

    }
}

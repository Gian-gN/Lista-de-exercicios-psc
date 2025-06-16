package lista04;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sorteados = new int[6];
        int[] jogados = new int[6];
        int i, j, acertos = 0;

        System.out.println("Digite os 6 numeros sorteados da Mega Sena:");
        for (i = 0; i < 6; i++) {
            System.out.print("Sorteado " + (i + 1) + ": ");
            sorteados[i] = scanner.nextInt();
        }

        System.out.println("Digite os 6 numeros do seu jogo:");
        for (i = 0; i < 6; i++) {
            System.out.print("Jogado " + (i + 1) + ": ");
            jogados[i] = scanner.nextInt();
        }

        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                if (jogados[i] == sorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("Voce acertou " + acertos + " numeros).");

    }
}

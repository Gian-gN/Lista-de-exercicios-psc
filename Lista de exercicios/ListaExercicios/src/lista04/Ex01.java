package lista04;

import java.util.Random;

public class Ex01 {

    public static void main(String[] args) {
        int[] vetor = new int[15];
        int maior, menor, posMaior = 0, posMenor = 0;
        Random random = new Random();

        // Gerar números aleatórios entre 0 e 100
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(101);
        }

        maior = vetor[0];
        menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }

        System.out.println("Vetor gerado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nMaior valor: " + maior + " na posicao " + posMaior);
        System.out.println("Menor valor: " + menor + " na posicao " + posMenor);
    }
}


package lista04;

import java.util.Scanner;
public class Ex12 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        String[] nomes = new String[10];
        int i;
        double soma = 0, media;

        System.out.println("Digite o nome e a nota de 10 alunos:");

        for (i = 0; i < 10; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Nota de " + nomes[i] + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        media = soma / 10;

        System.out.printf("\nMedia geral: %.2f\n", media);

        System.out.println("\nAlunos com nota abaixo da media:");
        for (i = 0; i < 10; i++) {
            if (notas[i] < media) {
                System.out.println(nomes[i] + " - Nota: " + notas[i]);
            }
        }

        System.out.println("\nAlunos com nota acima ou igual à media:");
        for (i = 0; i < 10; i++) {
            if (notas[i] >= media) {
                System.out.println(nomes[i] + " - Nota: " + notas[i]);
            }
        }

    }  
}

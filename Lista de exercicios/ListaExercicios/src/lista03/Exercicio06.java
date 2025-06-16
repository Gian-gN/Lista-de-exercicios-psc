package lista03;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0, cont = 0;

        do {
            System.out.print("Digite um número (0 para encerrar): ");
            num = scanner.nextInt();
            if (num != 0 && num % 2 == 0) {
                soma += num;
                cont++;
            }
        } while (num != 0);

        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.println("Média dos pares: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

    }
}

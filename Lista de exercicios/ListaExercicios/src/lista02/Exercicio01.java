package lista02;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O maior numero é: " + n1);
            System.out.println("O menor numero é: " + n2);
        } else if (n1 == n2) {
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("O maior numero é:" + n2);
            System.out.println("O menor numero é: " + n1);
        }

    }
}

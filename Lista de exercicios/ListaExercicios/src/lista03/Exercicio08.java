package lista03;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int soma = 0, contador = 0;

        for (int i = 0; i <= n; i++) {
            soma += i;
            contador++;
        }

        System.out.println("Soma: " + soma);
        System.out.println("Repetições: " + contador);
    }
}

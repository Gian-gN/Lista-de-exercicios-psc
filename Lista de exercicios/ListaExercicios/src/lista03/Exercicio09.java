package lista03;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        System.out.println("Divisores de " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}

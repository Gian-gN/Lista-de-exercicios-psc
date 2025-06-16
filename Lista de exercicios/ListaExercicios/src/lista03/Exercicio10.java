package lista03;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resp1, resp2, resp3;

        System.out.println("Pense em um número de 1 a 8 e responda: 's' ou 'n'.");

        System.out.print("O número esta entre 1 e 4? ");
        resp1 = scanner.next();

        if (resp1.equalsIgnoreCase("s")) {
            System.out.print("O número esta entre 1 e 2? ");
            resp2 = scanner.next();

            if (resp2.equalsIgnoreCase("s")) {
                System.out.print("O número é 1? ");
                resp3 = scanner.next();
                System.out.println("Seu numero e: " + (resp3.equalsIgnoreCase("s") ? "1" : "2"));
            } else {
                System.out.print("O número e 3? ");
                resp3 = scanner.next();
                System.out.println("Seu número é: " + (resp3.equalsIgnoreCase("s") ? "3" : "4"));
            }

        } else {
            System.out.print("O número está entre 5 e 6? ");
            resp2 = scanner.next();

            if (resp2.equalsIgnoreCase("s")) {
                System.out.print("O número é 5? ");
                resp3 = scanner.next();
                System.out.println("Seu número é: " + (resp3.equalsIgnoreCase("s") ? "5" : "6"));
            } else {
                System.out.print("O número é 7? ");
                resp3 = scanner.next();
                System.out.println("Seu número é: " + (resp3.equalsIgnoreCase("s") ? "7" : "8"));
            }
        }

    }
}

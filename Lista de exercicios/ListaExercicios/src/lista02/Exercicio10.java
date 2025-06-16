package lista02;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Tabela;

        System.out.println("Dias: Seg - 1 ");
        System.out.println("Ter - 2");
        System.out.println("Qua - 3");
        System.out.println("Qui - 4");
        System.out.println("Sex - 5");
        System.out.println("Sab - 6");
        System.out.println("Dom - 7");

        System.out.println("Escolha um dia da semana");
        Tabela = scanner.nextInt();

        if (Tabela == 1) {
            System.out.println("Segunda");
        } else if (Tabela == 2) {
            System.out.println("Terça");
        } else if (Tabela == 3) {
            System.out.println("Quarta");
        } else if (Tabela == 4) {
            System.out.println("Quinta");
        } else if (Tabela == 5) {
            System.out.println("Sexta");
        } else if (Tabela == 6) {
            System.out.println("Sabado");
        } else if (Tabela == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Digite um dia valido");
        }
    }
}

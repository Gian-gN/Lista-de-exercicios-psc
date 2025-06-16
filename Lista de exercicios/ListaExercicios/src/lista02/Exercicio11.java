package lista02;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Tabela;

        System.out.println("Meses: Janeiro - 1 ");
        System.out.println("Fevereiro - 2");
        System.out.println("Marco - 3");
        System.out.println("Abril - 4");
        System.out.println("Maio - 5");
        System.out.println("Junho - 6");
        System.out.println("Julho - 7");
        System.out.println("Agosto - 8");
        System.out.println("Setembro - 9");
        System.out.println("Outubro - 10");
        System.out.println("Novembro - 11");
        System.out.println("Dezembro - 12");

        System.out.println("Escolha um mes");
        Tabela = scanner.nextInt();

        if (Tabela == 1) {
            System.out.println("Janeiro");
        } else if (Tabela == 2) {
            System.out.println("Fevereiro");
        } else if (Tabela == 3) {
            System.out.println("Março");
        } else if (Tabela == 4) {
            System.out.println("Abril");
        } else if (Tabela == 5) {
            System.out.println("Maio");
        } else if (Tabela == 6) {
            System.out.println("Junho");
        } else if (Tabela == 7) {
            System.out.println("Julho");
        } else if (Tabela == 8) {
            System.out.println("Agosto");
        } else if (Tabela == 9) {
            System.out.println("Setembro");
        } else if (Tabela == 10) {
            System.out.println("Outubro");
        } else if (Tabela == 11) {
            System.out.println("Novembro");
        } else if (Tabela == 12) {
            System.out.println("Dezembro");    
        } else {
            System.out.println("Digite um MES valido");
        }
    }
}

package lista02;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Salario, Reajuste, Vtotal;
        System.out.println("SALARIO:  ");
        Salario = scanner.nextDouble();

        Reajuste = ((Salario * 30) / 100);
        Vtotal = Reajuste + Salario;

        if (Salario < 1000) {
            System.out.println("Voce tera um reajuste de: " + Reajuste);
            System.out.println("Seu salario passara para: " + Vtotal);
        } else {
            System.out.println("Voce nao tem direito ao aumento de 30%");
        }
    }
}

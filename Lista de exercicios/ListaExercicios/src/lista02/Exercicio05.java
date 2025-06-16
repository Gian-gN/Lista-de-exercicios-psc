package lista02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Sex;
        double Alt, PIH, PIM;
        System.out.println("DIGITE O NUMERO QUE CORRESPONDE AO SEU SEXO E DIGITE SUA ALTURA:   ");
        System.out.println("MASCULINO - 1 ");
        System.out.println("FEMENINO - 2 ");
        Sex = scanner.nextInt();
        System.out.println("ALTURA");
        Alt = scanner.nextDouble();

        PIH = ((72.7 * Alt) - 58);
        PIM = ((62.1 * Alt) - 44.7);

        if (Sex == 1) {
            System.out.println("Seu peso ideal é:  " + PIH);
        } else if (Sex == 2) {
            System.out.println("Seu peso ideal é:  " + PIM);
        } else {
            System.out.println("DIGITE UM NUMERO VALIDO!");
        }
    }
}

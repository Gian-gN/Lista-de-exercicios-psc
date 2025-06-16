package lista02;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Peso;
        double Alt, IMC;
        System.out.println("CALCULAR IMC");
        System.out.println("PESO:");
        Peso = scanner.nextInt();
        System.out.println("ALTURA");
        Alt = scanner.nextDouble();

        IMC = (Peso / (Alt * Alt));
        System.out.println("IMC:  " + IMC);

        if (IMC < 19) {
            System.out.println("Voce esta abaixo do peso");
        } else if (IMC >= 19 && IMC <= 24) {
            System.out.println("Voce esta com o peso normal");
        } else if (IMC >= 24 && IMC <= 29) {
            System.out.println("Voce esta Sobre peso");
        } else if (IMC >= 29 && IMC <= 39) {
            System.out.println("Voce esta OBESO");
        } else {

            System.out.println("Voce esta OBESO MORBIDO ");
        }

    }
}

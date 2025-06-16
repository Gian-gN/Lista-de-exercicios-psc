package lista02;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, Z;
        System.out.println("Digite o valor do X: ");
        X = scanner.nextInt();
        System.out.println("Digite o valor do Y: ");
        Y = scanner.nextInt();
        System.out.println("Digite o valor do Z: ");
        Z = scanner.nextInt();

        if (X + Y > Z && X + Z > Y && Y + Z > X) {
            System.out.println("Com esses valores é possivel formar um Triangulo!");
        } else {
            System.out.println("Esses valores nao formam um triangulo");
        }

    }
}

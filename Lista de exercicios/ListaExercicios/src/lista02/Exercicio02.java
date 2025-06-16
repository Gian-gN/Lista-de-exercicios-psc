package lista02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1, N2, MED;
        System.out.println("DIGITE A SEGUIR DUAS NOTAS E VEJA A MEDIA");
        System.out.println("Nota 1:  ");
        N1 = scanner.nextInt();
        System.out.println("Nota 2:  ");
        N2 = scanner.nextInt();

        MED = ((N1 + N2) / 2);
        System.out.println("Sua MEDIA foi:  " + MED);

        if (MED >= 7) {
            System.out.println("Situacao: APROVADO");
        } else {
            System.out.println("Situacao: REPROVADO");
        }
    }
}

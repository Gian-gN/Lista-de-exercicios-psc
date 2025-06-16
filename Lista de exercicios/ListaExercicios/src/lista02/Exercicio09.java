package lista02;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Idade;
        System.out.println("CLASSE ELEITORAL");
        System.out.print("Digite sua IDADE  ");
        Idade = scanner.nextInt();

        if (Idade < 16) {
            System.out.println("NÃO ELEITOR");
        } else if (Idade >= 18 && Idade < 65) {
            System.out.println("ELEITOR OBRIGATORIO");
        } else {
            
            System.out.println("ELEITOR FACULTATIVO");
        }
    }
}


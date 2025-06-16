package lista02;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Idade;
        System.out.println("OLA NADADOR! DIGITE SUA IDADE");
        Idade = scanner.nextInt();

        if (Idade <= 7) {
            System.out.println("CATEGORIA::  INFANTIL");
        } else if (Idade > 7 && Idade <= 10) {
            System.out.println("CATEGORIA::  JUVENIL");
        } else if (Idade > 10 && Idade <= 15) {
            System.out.println("CATEGORIA::  ADOLESCENTE");
        } else if (Idade > 15 && Idade <= 30) {
            System.out.println("CATEGORIA::  ADULTO");
        } else {
            System.out.println("CATEGORIA::  SENIOR");
        }
    }

}

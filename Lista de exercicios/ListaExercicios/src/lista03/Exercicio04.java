package lista03;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a massa inicial (em gramas): ");
        double massa = scanner.nextDouble();
        double massaInicial = massa;
        int tempo = 0;

        while (massa >= 0.5) {
            massa /= 2;
            tempo += 50;
        }

        int horas = tempo / 3600;
        int minutos = (tempo % 3600) / 60;
        int segundos = tempo % 60;

        System.out.println("Massa inicial: " + massaInicial + "g");
        System.out.println("Tempo necessario: " + horas + "h " + minutos + "min " + segundos + "s");
    }
}

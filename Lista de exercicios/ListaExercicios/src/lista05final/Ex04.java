package lista05final;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double antigo, atual, percentual;

        System.out.print("Digite o valor antigo: ");
        antigo = scanner.nextDouble();
        System.out.print("Digite o valor atual: ");
        atual = scanner.nextDouble();

        percentual = calcularAumento(antigo, atual);

        System.out.printf("Percentual de acrescimo: %.2f%%\n", percentual);

        
    }

    public static double calcularAumento(double antigo, double atual) {
        return ((atual - antigo) / antigo) * 100;
    }
}

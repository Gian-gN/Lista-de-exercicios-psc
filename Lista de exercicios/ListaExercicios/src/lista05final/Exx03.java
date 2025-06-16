package lista05final;

import java.util.Scanner;

public class Exx03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSegundos, horas = 0, minutos = 0, segundos = 0;

        System.out.print("Digite a quantidade de segundos: ");
        totalSegundos = scanner.nextInt();

        converterTempo(totalSegundos, new int[]{horas}, new int[]{minutos}, new int[]{segundos});

       
    }

    public static void converterTempo(int total, int[] h, int[] m, int[] s) {
        h[0] = total / 3600;
        m[0] = (total % 3600) / 60;
        s[0] = total % 60;
        System.out.println("Horas: " + h[0] + ", Minutos: " + m[0] + ", Segundos: " + s[0]);
    }
}

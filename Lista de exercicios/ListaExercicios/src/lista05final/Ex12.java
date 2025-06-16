
package lista05final;
import java.util.Scanner;

public class Ex12 {
     public static void main(String[] args) {
        Scanner impressoradigital = new Scanner(System.in);

        char[] sexo = new char[5];
        char[] olhos = new char[5];
        char[] cabelos = new char[5];
        int[] idades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Sexo (M/F): ");
            sexo[i] = impressoradigital.next().toUpperCase().charAt(0);
            System.out.print("Olhos (A/C): ");
            olhos[i] = impressoradigital.next().toUpperCase().charAt(0);
            System.out.print("Cabelos (L/P/C): ");
            cabelos[i] = impressoradigital.next().toUpperCase().charAt(0);
            System.out.print("Idade: ");
            idades[i] = impressoradigital.nextInt();
        }

        double media = mediaCastanhosPretos(olhos, cabelos, idades);
        int maior = maiorIdade(idades);
        int mulheresPerfil = contarMulheresPerfil(sexo, olhos, cabelos, idades);

        System.out.printf("Media de idade (olhos castanhos e cabelo preto): %.2f\n", media);
        System.out.println("Maior idade: " + maior);
        System.out.println("Quantidade de mulheres entre 18-35 com olhos azuis e cabelo louro: " + mulheresPerfil);

        impressoradigital.close();
    }

    public static double mediaCastanhosPretos(char[] olhos, char[] cabelos, int[] idades) {
        int soma = 0, cont = 0;
        for (int i = 0; i < 5; i++) {
            if (olhos[i] == 'C' && cabelos[i] == 'P') {
                soma += idades[i];
                cont++;
            }
        }
        return cont > 0 ? (double) soma / cont : 0;
    }

    public static int maiorIdade(int[] idades) {
        int maior = idades[0];
        for (int i = 1; i < 5; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
            }
        }
        return maior;
    }

    public static int contarMulheresPerfil(char[] sexo, char[] olhos, char[] cabelos, int[] idades) {
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (sexo[i] == 'F' && olhos[i] == 'A' && cabelos[i] == 'L' && idades[i] >= 18 && idades[i] <= 35) {
                cont++;
            }
        }
        return cont;
    }
}

package lista05final;

import java.util.Scanner;

public class exO01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, resultado;

        System.out.print("Digite o valor de a (maior que 1): ");
        a = scanner.nextInt();
        System.out.print("Digite o valor de b: ");
        b = scanner.nextInt();
        System.out.print("Digite o valor de c: ");
        c = scanner.nextInt();

        resultado = somarDivisiveis(a, b, c);

        System.out.println("Soma dos multiplos de " + a + " entre " + b + " e " + c + ": " + resultado);

   
    }

    public static int somarDivisiveis(int a, int b, int c) {
        int soma = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;
    }
}

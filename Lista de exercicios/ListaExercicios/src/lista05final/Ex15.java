package lista05final;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, resultado;

        while (true) {
            System.out.print("Digite o valor de x: ");
            x = scanner.nextInt();
            System.out.print("Digite o valor de y: ");
            y = scanner.nextInt();

            if (x == y) {
                System.out.println("Fim do programa.");
                break;
            }

            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }

            resultado = somarPrimosEntre(x, y);

            System.out.println("Soma dos números primos entre " + x + " e " + y + ": " + resultado);
        }

        scanner.close();
    }

    public static int somarPrimosEntre(int x, int y) {
        int soma = 0;
        for (int i = x; i <= y; i++) {
            if (ehPrimo(i)) {
                soma += i;
            }
        }
        return soma;
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


package lista05final;

import java.util.Scanner;
public class ex02 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, resultado;

        System.out.print("Digite o primeiro número: ");
        n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = scanner.nextInt();

        resultado = somarEntre(n1, n2);

        System.out.println("Soma dos números entre " + n1 + " e " + n2 + ": " + resultado);

    }

    public static int somarEntre(int n1, int n2) {
        int soma = 0;
        for (int i = n1 + 1; i < n2; i++) {
            soma += i;
        }
        return soma;
    } 
}

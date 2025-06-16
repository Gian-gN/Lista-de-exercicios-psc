
package lista05final;

import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, resultado;
        char tipo;

        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = scanner.nextDouble();
        System.out.print("Digite o tipo de média (A - aritmetica / P - ponderada): ");
        tipo = scanner.next().toUpperCase().charAt(0);

        resultado = calcularMedia(n1, n2, n3, tipo);

        System.out.printf("Média calculada: %.2f\n", resultado);
    }

    public static double calcularMedia(double n1, double n2, double n3, char tipo) {
        if (tipo == 'A') {
            return (n1 + n2 + n3) / 3;
        } else {
            return (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        }
    }
}

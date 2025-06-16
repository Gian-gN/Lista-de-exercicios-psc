
package lista05final;
import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double resultado;

        System.out.print("Digite um valor inteiro positivo: ");
        n = scanner.nextInt();

        resultado = calcularS(n);

        System.out.printf("Resultado de S: %.4f\n", resultado);

        scanner.close();
    }

    public static double calcularS(int n) {
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        return s;
    }  
}

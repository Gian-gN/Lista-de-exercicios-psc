
package lista05final;

import java.util.Scanner;
public class Ex05 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero de 1 a 9: ");
        n = scanner.nextInt();

        mostrarTabuada(n);

 
    }

    public static void mostrarTabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    } 
}

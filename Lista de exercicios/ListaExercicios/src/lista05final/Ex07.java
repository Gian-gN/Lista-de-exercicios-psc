
package lista05final;

import java.util.Scanner;
public class Ex07 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hInicio, mInicio, hFim, mFim, duracao;

        System.out.print("Hora de início: ");
        hInicio = scanner.nextInt();
        System.out.print("Minutos de início: ");
        mInicio = scanner.nextInt();
        System.out.print("Hora de término: ");
        hFim = scanner.nextInt();
        System.out.print("Minutos de término: ");
        mFim = scanner.nextInt();

        duracao = calcularDuracao(hInicio, mInicio, hFim, mFim);

        System.out.println("Duração do jogo: " + duracao + " minutos");

    }

    public static int calcularDuracao(int hIni, int mIni, int hFim, int mFim) {
        int inicio = hIni * 60 + mIni;
        int fim = hFim * 60 + mFim;
        if (fim < inicio) {
            fim += 24 * 60;
        }
        return fim - inicio;
    } 
}

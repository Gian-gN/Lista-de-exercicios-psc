
package lista05final;


public class Ex11 {
   public static void main(String[] args) {
        int[] perfeitos = encontrarPerfeitos();
        System.out.println("Três primeiros números perfeitos:");
        for (int i = 0; i < 3; i++) {
            System.out.print(perfeitos[i] + "");
        }
    }

    public static int[] encontrarPerfeitos() {
        int[] perfeitos = new int[3];
        int numero = 2, count = 0;

        while (count < 3) {
            int soma = 0;
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) {
                    soma += i;
                }
            }
            if (soma == numero) {
                perfeitos[count] = numero;
                count++;
            }
            numero++;
        }

        return perfeitos;
    } 
}

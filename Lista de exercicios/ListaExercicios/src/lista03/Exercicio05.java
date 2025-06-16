
package lista03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;
        int codigo;

        do {
            System.out.println("Digite o tipo de combustível (1-Alcool, 2-Gasolina, 3-Diesel, 4-Fim):");
            codigo = scanner.nextInt();

            switch (codigo) {
                case 1:  {
                    alcool++;
                    System.out.println("Alcool");
                }
                case 2: {
                    gasolina++;
                    System.out.println("Gasolina");
                }
                case 3: {
                    diesel++;
                    System.out.println("Diesel");
                }
                case 4: System.out.println("Encerrando...");
                default: System.out.println("Código inválido. Tente novamente.");
            }

        } while (codigo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}


package lista02;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double N1, N2, N3, MED;
        System.out.println("Digite a seguir 3 notas");
        System.out.println("Nota 1");
        N1 = scanner.nextDouble();
        System.out.println("Nota 2");
        N2 = scanner.nextDouble();
        System.out.println("Nota 3");
        N3 = scanner.nextDouble();

        MED = ((N1 + N2 + N3) / 3);
        System.out.printf("Sua MEDIA foi: %.2f\n", MED);

        if (MED >= 0 && MED < 3) {
            System.out.println("SITUACAO: REPROVADO");
        } else if (MED >= 3 && MED < 7) {
            System.out.println("SITUACAO: EXAME");
        } else if (MED >= 7 && MED <= 10) {
            System.out.println("SITUACAO: APROVADO");
        } else {
            System.out.println("Média valida de 0 a 10");
        }
    }
}
// Utilizei o Double pra não ter arredondamento e as respostas ficarem mais
// precisas, mas se fosse arrendondando os numeros
// e não tivesse casas decimais usaria o int    


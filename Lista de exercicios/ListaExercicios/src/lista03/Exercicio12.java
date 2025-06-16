package lista03;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int idadeMenorSalario = 0;
        char sexo, sexoMenorSalario = ' ';
        double salario, menorSalario = Double.MAX_VALUE;
        double somaSalarios = 0;
        int count = 0;
        int mulheres = 0;

        while (true) {
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            if (idade < 0) {
                break;
            }

            System.out.print("Sexo (M/F/I): ");
            sexo = scanner.next().toUpperCase().charAt(0);

            System.out.print("Salário: ");
            salario = scanner.nextDouble();

            somaSalarios += salario;
            count++;

            if (sexo == 'F') {
                mulheres++;
            }

            if (idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }

        if (count > 0) {
            System.out.println("Média dos salários: " + (somaSalarios / count));
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Quantidade de mulheres: " + mulheres);
            System.out.println("Pessoa com menor salário: idade = " + idadeMenorSalario + ", sexo = " + sexoMenorSalario);
        } else {
            System.out.println("Nenhum dado inserido.");
        }

        scanner.close();
    }
}

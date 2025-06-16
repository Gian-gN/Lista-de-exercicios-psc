
package lista02;

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2,Tabela;
        double resultado;
        System.out.println("NUMERO 1: ");
        n1 = scanner.nextInt();
        System.out.println("NUMERO 2: ");
        n2 = scanner.nextInt();
        
        System.out.println("----------------------------------");
        System.out.println("-----ESCOLHA A OPCAO DESEJADA-----");
        System.out.println("-----------(1 - SOMAR)------------");
        System.out.println("----------(2 - SUBTRAIR)----------");
        System.out.println("--------(3 - MULTIPLICAR)---------");
        System.out.println("-----------(4 - DIVIDR)-----------");
        System.out.println("------------(5- SAIR)-------------");
        System.out.println("----------------------------------");
        Tabela = scanner.nextInt();
        
        if (Tabela == 1) {
            resultado = n1 + n2;
            System.out.println("SOMA DOS NUMEROS: " + resultado);
        } else if (Tabela == 2) {
            resultado = n1 - n2;
            System.out.println("SUBTRACAO DOS NUMEROS: " + resultado);
        } else if (Tabela == 3) {
            resultado = n1 * n2;
            System.out.println("MULTIPLICACAO DOS NUMEROS: " + resultado);
        } else if (Tabela == 4) {
            if (n2 != 0) {
                resultado = (double) n1 / n2;
                System.out.println("DIVISAO DOS NUMEROS: " + String.format("%.2f", resultado));
            } else {
                System.out.println("Erro: divisao por zero!");
            }
        } else if (Tabela == 5) {
            System.out.println("SAINDO...");
        } else {
            System.out.println("Opcao invalida!");
        }
        
}
    
}
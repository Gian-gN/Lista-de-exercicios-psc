package lista03;

public class Exercicio11 {

    public static void main(String[] args) {
        double popuA = 90000000;
        double popuB = 200000000;
        int anos = 0;

        while (popuA < popuB) {
            popuA *= 1.03;
            popuB *= 1.015;
            anos++;
        }

        System.out.println("Serao necessarios " + anos + " anos.");
    }
}

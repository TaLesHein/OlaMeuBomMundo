import java.util.Scanner;

public class Calculadora {
    static Scanner scanner = new Scanner(System.in);
    static String conta;

    public static void main(String[] args) {
        System.out.print("Insira o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("\nInsira o segundo número: ");
        int n2 = scanner.nextInt();

        int result = operacao(n1, n2);

        System.out.printf("O resultado da sua conta é de: " + result);
    }

    static int operacao(int n1, int n2) {
        System.out.println("\nQual a operação?");
        System.out.println("|1| +");
        System.out.println("|2| -");
        System.out.println("|3| *");
        System.out.println("|4| /");

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                return n1 + n2;

            case 2:
                return n1 - n2;

            case 3:
                return n1 * n2;

            case 4:
                return n1 / n2;

        }
        return op;

    }
}
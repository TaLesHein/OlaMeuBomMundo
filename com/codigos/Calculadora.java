import java.util.Scanner;

public class Calculadora {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insira o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("\nInsira o segundo número: ");
        int n2 = scanner.nextInt();

        operacao(n1, n2);

    }

    static void operacao(int n1, int n2) {
        int result;

        System.out.println("\nQual a operação?");
        System.out.println("|1| +");
        System.out.println("|2| -");
        System.out.println("|3| *");
        System.out.println("|4| /");

        int op = scanner.nextInt();

        switch (op) {
            case 1:
                result = n1 + n2;
                System.out.printf("O resultado de %d + %d = %d", n1, n2, result);
                break;

            case 2:
                result = n1 - n2;
                System.out.printf("O resultado de %d - %d = %d", n1, n2, result);
                break;

            case 3:
                result = n1 * n2;
                System.out.printf("O resultado de %d * %d = %d", n1, n2, result);
                break;

            case 4:
                result = n1 / n2;
                System.out.printf("O resultado de %d / %d é de %d", n1, n2, result);
                break;
        }

    }
}
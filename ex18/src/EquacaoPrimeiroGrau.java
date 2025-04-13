import java.util.Scanner;

public class EquacaoPrimeiroGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();

        double x = -b / a;
        System.out.println("A solução da equação é x = " + x);

        scanner.close();
    }
}
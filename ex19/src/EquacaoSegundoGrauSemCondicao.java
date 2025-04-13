import java.util.Scanner;

public class EquacaoSegundoGrauSemCondicao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = entrada.nextDouble();

        double delta = b * b - 4 * a * c;
        double raizDelta = Math.sqrt(delta);

        double x1 = (-b + raizDelta) / (2 * a);
        double x2 = (-b - raizDelta) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        entrada.close();
    }
}
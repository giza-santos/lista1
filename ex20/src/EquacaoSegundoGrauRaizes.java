
import java.util.Scanner;

public class EquacaoSegundoGrauRaizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira raiz: ");
        double raiz1 = entrada.nextDouble();

        System.out.print("Digite a segunda raiz: ");
        double raiz2 = entrada.nextDouble();

        // Fórmula: a(x - raiz1)(x - raiz2) = 0
        // Para simplificar, assumimos a = 1
        double a = 1;
        double b = -(raiz1 + raiz2);
        double c = raiz1 * raiz2;

        System.out.println("A equação do segundo grau é: ");
        System.out.println(a + "x² + " + b + "x + " + c + " = 0");

        entrada.close();
    }
}
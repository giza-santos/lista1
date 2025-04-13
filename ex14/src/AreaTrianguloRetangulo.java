import java.util.Scanner;

public class AreaTrianguloRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo retângulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2.0;

        System.out.println("A área do triângulo retângulo é: " + area);

        scanner.close();
    }
}
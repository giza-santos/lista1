import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (N1): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (N2): ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
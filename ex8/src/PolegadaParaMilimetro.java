import java.util.Scanner;

public class PolegadaParaMilimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em polegadas: ");
        double polegadas = scanner.nextDouble();

        double milimetros = polegadas * 25.4;

        System.out.println("A medida em milímetros é: " + milimetros);

        scanner.close();
    }
}
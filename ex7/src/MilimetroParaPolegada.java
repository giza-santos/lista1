import java.util.Scanner;
public class MilimetroParaPolegada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida em milímetros: ");
        double milimetros = scanner.nextDouble();

        double polegadas = milimetros / 25.4;

        System.out.println("A medida em polegadas é: " + polegadas);

        scanner.close();
    }
}

import java.util.Scanner;

public class MilhasParaQuilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = milhas * 1.60934;

        System.out.println("A distância em quilômetros é: " + quilometros);

        scanner.close();
    }
}
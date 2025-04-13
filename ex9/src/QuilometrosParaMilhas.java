
import java.util.Scanner;

public class QuilometrosParaMilhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = scanner.nextDouble();

        double milhas = quilometros * 0.621371;

        System.out.println("A distância em milhas é: " + milhas);

        scanner.close();
    }
}
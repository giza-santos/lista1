
import java.util.Scanner;
public class ConversaoVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double velocidadeMs = scanner.nextDouble();

        double velocidadeKmH = velocidadeMs * 3.6;

        System.out.println("A velocidade em Km/h é: " + velocidadeKmH);

        scanner.close();
    }
}
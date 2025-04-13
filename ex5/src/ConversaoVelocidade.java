import java.util.Scanner;

public class ConversaoVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em Km/h: ");
        double velocidadeKmH = scanner.nextDouble();

        double velocidadeMs = velocidadeKmH / 3.6;

        System.out.println("A velocidade em m/s é: " + velocidadeMs);

        scanner.close();
    }
}
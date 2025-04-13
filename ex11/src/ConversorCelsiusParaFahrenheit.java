import java.util.Scanner;

public class ConversorCelsiusParaFahrenheit {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        // Fecha o Scanner para evitar vazamento de recursos
        scanner.close();

        // Converte a temperatura para Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        // Exibe o resultado
        System.out.printf("%.2f°C equivalem a %.2f°F.%n", temperaturaCelsius, temperaturaFahrenheit);
    }
}
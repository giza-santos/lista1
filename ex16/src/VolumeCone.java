import java.util.Scanner;

public class VolumeCone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        double volume = calcularVolumeCone(raio, altura);

        System.out.println("O volume do cone é: " + volume);

        scanner.close();
    }

    public static double calcularVolumeCone(double raio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
    }
}
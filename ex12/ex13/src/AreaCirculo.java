import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + areaCirculo);

        scanner.close();
    }
}
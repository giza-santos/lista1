import java.util.Scanner;

public class QuintaParte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        double quintaParte = numero / 5.0;

        System.out.println("A quinta parte de " + numero + " é " + quintaParte);

        scanner.close();
    }
}
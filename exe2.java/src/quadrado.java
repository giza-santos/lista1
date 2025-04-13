import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int quadrado= numero * numero;

        System.out.println("O quadado de " + numero + " é " + quadrado );

        scanner.close();
    }
}
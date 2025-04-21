
import java.util.Scanner;

public class FatorialUsuarioForUnico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro  para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = 1;

        if (numero < 0) {
            System.out.println();
        } else if (numero == 0) {
            System.out.println("O fatorial de 0 é 1.");
        } else {
            for (int i = numero; i >= 1; i--) {
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        scanner.close();
    }
}
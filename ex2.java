import java.util.Scanner;

public class ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contador = 0;
            Integer maiorNumero = null;
            Integer menorNumero = null;

            while (contador < 5) {
                try {
                    System.out.printf("Digite o %dº número inteiro: ", contador + 1);
                    int numero = scanner.nextInt();

                    if (maiorNumero == null || numero > maiorNumero) {
                        maiorNumero = numero;
                    }
                    if (menorNumero == null || numero < menorNumero) {
                        menorNumero = numero;
                    }

                    contador++;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um inteiro.");
                    scanner.next();
                }
            }

            scanner.close();

            if (maiorNumero != null) {
                System.out.println("\nMaior número: " + maiorNumero);
                System.out.println("Menor número: " + menorNumero);
            }
        }
}
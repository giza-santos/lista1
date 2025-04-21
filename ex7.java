import java.util.Scanner;

public class ex7 {
    public class Tabuadas {
        public static void main(String[] args) {
            System.out.println("Exibindo as Tabuadas do 1 ao 10:");
            System.out.println("------------------------------");

            // Loop externo para percorrer os números de 1 a 10 (as tabuadas)
            for (int i = 1; i <= 10; i++) {
                System.out.println("\nTabuada do " + i + ":");
                System.out.println("-------------");

                // Loop interno para calcular e exibir a tabuada do número atual
                for (int j = 1; j <= 10; j++) {
                    int resultado = i * j;
                    System.out.println(i + " x " + j + " = " + resultado);
                }
            }

            System.out.println("------------------------------");

        }
    }
}
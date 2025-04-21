import java.util.Scanner;
public class tab{
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int num1;
        System.out.println("digite um numero");
        num1 = numero.nextInt();
        int resultado;

        int i = 0;
        while (i <= 10) {
            resultado = num1 * i;
            System.out.println(num1 + " X " + i + " = " + resultado);

            i++;
        }
    }
}
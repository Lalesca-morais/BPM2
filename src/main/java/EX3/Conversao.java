package EX3;

import java.util.Scanner;
import static EX3.Fibonacci.fibonacci;

public class Conversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int N = scanner.nextInt();

        long resultado = fibonacci(N);
        System.out.println("N: " + N +  " -> saída Fibonacci: " + resultado);
    }
}

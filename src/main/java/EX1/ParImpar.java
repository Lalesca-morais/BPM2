package EX1;

import java.util.*;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de valores a serem inseridos:");
        int N = scanner.nextInt();

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        System.out.println("Digite os valores:");
        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares, Comparator.reverseOrder());

        System.out.println("Valores ordenados:");
        for (int par : pares) {
            System.out.println("Números pares em ordem crescente: " + par);
        }
        for (int impar : impares) {
            System.out.println("Números ímpares em ordem decrescente: " + impar);
        }
    }
}


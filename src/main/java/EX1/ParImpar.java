package EX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ParImpar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite o número de valores:");
        int linhas = Integer.parseInt(br.readLine());

        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Digite os valores:");
        for (int i = 0; i < linhas; i++) {
            int valor = Integer.parseInt(br.readLine());
            listaNumeros.add(valor);
        }
        var pares = listaNumeros.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var impares = listaNumeros.stream().filter(l -> l % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        List<Integer> total = new ArrayList<>();
        total.addAll(pares);
        total.addAll(impares);
        System.out.println("Valores ordenados:");
        total.forEach(System.out::println);
    }
}



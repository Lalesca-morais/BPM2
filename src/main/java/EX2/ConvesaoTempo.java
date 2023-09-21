package EX2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class ConvesaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        long valor = scanner.nextLong();

        Date data = new Date(valor * 1000);
        SimpleDateFormat conversao = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        conversao.setTimeZone(TimeZone.getTimeZone("UTC"));

        String dataFormatada = conversao.format(data);
        System.out.println("Entrada: " + valor);
        System.out.println("Saída: " + dataFormatada);
    }
}

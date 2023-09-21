package EX2;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor inteiro:");
        long segundos = input.nextLong();

        SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        long millis = segundos * 1000;
        Date date = new Date(millis);

        System.out.println("Saída: " + df.format(date));
    }
}



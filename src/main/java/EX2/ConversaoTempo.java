package EX2;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.TimeZone;

public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inteiro:");
        long seconds = scanner.nextLong();

        SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        long millis = seconds * 1000;
        Date date = new Date(millis);

        System.out.println(df.format(date));
    }
}


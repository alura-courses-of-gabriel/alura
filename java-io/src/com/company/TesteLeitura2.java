package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            Scanner linhaScanner = new Scanner(scanner.nextLine());
            linhaScanner.useDelimiter(",");
            linhaScanner.useLocale(Locale.US);

            String result = formatar("%s %s %s %s %s", linhaScanner.next(), linhaScanner.nextInt(), linhaScanner.nextInt(), linhaScanner.next(), linhaScanner.nextDouble());

            System.out.println(result);

            linhaScanner.close();
        }
        scanner.close();
    }

    private static String formatar(String format, Object... args) {
        return String.format(Locale.GERMANY, format, args);
    }
}

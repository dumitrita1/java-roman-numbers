import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.printf("Wähle deine Umrechnung: Römische Notation (1) Arabische Notation (2)");
        int notation = scanner.nextInt();

        if (notation == 1) {
            System.out.printf("Geben Sie ein Jahr ein:");
            int zahl = scanner.nextInt();
            String result = converter.convertFromNumberToRoman(zahl);
            System.out.println(result);
        } else {
            System.out.printf("Geben Sie das Jahr in römischer Notation ein:");
            String zahl = scanner.next();
            int result = converter.convertFromRomanToNumber(zahl);
            System.out.println(result);
        }
    }
}
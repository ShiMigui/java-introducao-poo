import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dollar price: ");
        float vlCota = sc.nextFloat();
        System.out.print("How many dollars will be bought: ");
        float qtCota = sc.nextFloat();
        sc.close();

        System.out.println();
        System.out.printf("Amount to be paid: R$ %.2f\n", CurrencyConverter.convert(vlCota, qtCota, .06f));
    }
}

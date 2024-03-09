import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Circumference {
    public static void main(String[] args) throws Exception{
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        sc.close();

        System.out.println();

        System.out.printf("Circumference: %.2f\n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f\n", Calculator.volume(radius));
        System.out.printf("PI: %.2f\n", Calculator.PI);
    }
}

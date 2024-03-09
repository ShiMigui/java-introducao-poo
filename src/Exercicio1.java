import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Rectangle rectangle;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width and height: ");
        rectangle = new Rectangle(sc.nextFloat(), sc.nextFloat());
        sc.close();

        System.out.printf("AREA = %.2f\n", rectangle.area);
        System.out.printf("DIAGONAL = %.2f\n", rectangle.diagonal);
        System.out.printf("PERIMETER = %.2f\n", rectangle.perimeter);
    }
}

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class TriangleApp {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Triangle x, y;

        Scanner sc = new Scanner(System.in);
        /*
         * OPCAO 1: Passando cada atributo p/ propriedades
         * System.out.print("Enter the measures of triangle X: ");
         * x = new Triangle();
         * x.ladoA = sc.nextFloat();
         * x.ladoB = sc.nextFloat();
         * x.ladoC = sc.nextFloat();
         * System.out.print("Enter the measures of triangle Y: ");
         * y = new Triangle();
         * y.ladoA = sc.nextFloat();
         * y.ladoB = sc.nextFloat();
         * y.ladoC = sc.nextFloat();
         */
        // OPCAO 2: Sobrecarga no construtor e passar propriedades por ele
        System.out.print("Enter the measures of triangle X: ");
        x = new Triangle(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());

        System.out.print("Enter the measures of triangle Y: ");
        y = new Triangle(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        sc.close();

        double xArea = x.area(), yArea = y.area();

        System.out.printf("Area of triangle X: %.4f\n", xArea);
        System.out.printf("Area of triangle Y: %.4f\n", yArea);

        char letterLargerArea;
        if(xArea > yArea) letterLargerArea = 'X';
        else letterLargerArea = 'Y';
        System.out.println("Larger area: " + letterLargerArea);
        
    }
}

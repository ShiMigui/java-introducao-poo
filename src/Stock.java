import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Stock {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Product product = new Product();

        Scanner sc = new Scanner(System.in);

        // #region Preparando produto
        System.out.println("### Enter product data ###");
        System.out.print("Name: ");
        product.nm = sc.nextLine();
        System.out.print("Price: ");
        product.vl = sc.nextFloat();
        System.out.print("Quantity in stock: ");
        product.qt = sc.nextInt();
        // #endregion
        System.out.println("Product data: " + product);

        boolean restart;
        do {
            System.out.print("Enter the number of products to be added to stock: ");
            int qt = sc.nextInt();
            if (qt > 0) product.updateQtInStock(qt);

            System.out.print("Deseja repetir processo? (s/n) ");
            restart = sc.next().toLowerCase().charAt(0) == 's';
        } while (restart);

        do {
            System.out.print("Enter the number of products to be removed to stock: ");
            int qt = sc.nextInt();
            if (qt > 0) product.updateQtInStock(-qt);

            System.out.print("Deseja repetir processo? (s/n) ");
            restart = sc.next().toLowerCase().charAt(0) == 's';
        } while (restart);

        sc.close();
    }
}

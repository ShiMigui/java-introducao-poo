import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Account code: ");
        int code = sc.nextInt();

        sc.nextLine();

        System.out.print("Account holder name: ");
        String holder = sc.nextLine();

        double balance = 0;
        System.out.print("Enter the inicial balance? (y/N) ");
        if (sc.next().toLowerCase().charAt(0) == 'y') {
            System.out.print("Account balance: ");
            balance = sc.nextDouble();
        }

        AccountBank accountBank = new AccountBank(code, holder, balance);
        System.out.println(accountBank);

        System.out.print("Enter a deposit value: ");
        accountBank.deposit(sc.nextDouble());
        System.out.println("Update " + accountBank);

        System.out.print("Enter a withdraw value: ");
        accountBank.withdraw(sc.nextDouble());
        System.out.println("Update " + accountBank);

        sc.close();
    }
}

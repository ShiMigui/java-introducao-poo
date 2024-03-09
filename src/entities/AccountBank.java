package entities;

public class AccountBank {
    private int code;
    private String holder;
    private double balance;

    public AccountBank(int code, String holder, double balance) {
        this.code = code;
        this.holder = holder;
        deposit(balance);
    }

    public int getCode() {
        return code;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account" +
                "\nCode: " + code +
                "\nHolder: " + holder +
                "\nBalance: $ " + String.format("%.2f", balance) + "\n";
    }
}

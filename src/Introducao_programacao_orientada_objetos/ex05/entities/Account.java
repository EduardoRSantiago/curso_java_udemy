package Introducao_programacao_orientada_objetos.ex05.entities;

public class Account {

    private int accountNumber;
    private String accountName;
    private double balance;

    public Account() {

    }

    public Account(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.accountName = name;
        deposit(amount);
    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.accountName = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
                + accountNumber
                + ", Holder: "
                + accountName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}

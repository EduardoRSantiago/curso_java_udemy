package Introducao_programacao_orientada_objetos.ex05.application;

import Introducao_programacao_orientada_objetos.ex05.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountName = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char initialDeposit = sc.next().charAt(0);

        Account account;

        if (initialDeposit == 'y') {

            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();

            account = new Account(accountNumber, accountName, amount);
        } else {
            account = new Account(accountNumber, accountName);
        }

        System.out.println();

        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}

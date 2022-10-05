package classes_e_metodos_abstratos.application;

import classes_e_metodos_abstratos.entities.LegalPerson;
import classes_e_metodos_abstratos.entities.PhysicalPerson;
import classes_e_metodos_abstratos.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();

                taxPayers.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employers: ");
                int numberOfEmployers = sc.nextInt();

                taxPayers.add(new LegalPerson(name, annualIncome, numberOfEmployers));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        for (TaxPayer taxPayer: taxPayers) {
            System.out.println(taxPayer.toString());
        }

        double totalTaxes = 0.0;

        for (TaxPayer taxPayer: taxPayers) {
            totalTaxes += taxPayer.incomeTax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);
        sc.close();
    }
}

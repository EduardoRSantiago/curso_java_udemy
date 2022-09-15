package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employerNumber = sc.nextInt();

        int hourWork = sc.nextInt();

        double hourSalary = sc.nextDouble();

        double salary = hourSalary * hourWork;

        System.out.println("NUMBER = " + employerNumber);
        System.out.printf("SALARY = U$ %.2f", salary);

        sc.close();
    }
}

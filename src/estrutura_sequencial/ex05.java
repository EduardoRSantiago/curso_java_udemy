package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int quantity1 = sc.nextInt();
        double value1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int quantity2 = sc.nextInt();
        double value2 = sc.nextDouble();

        double total1 = quantity1 * value1;
        double total2 = quantity2 * value2;

        double totalValue = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalValue);

        sc.close();
    }
}

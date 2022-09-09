package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 2:
                total = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 3:
                total = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 4:
                total = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f", total);
                break;
            case 5:
                total = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f", total);
                break;
            default:
                System.out.println("Numero invalido!");
        }

        sc.close();
    }
}

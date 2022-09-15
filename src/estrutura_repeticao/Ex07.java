package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            int primeiro = sc.nextInt();
            int segundo = sc.nextInt();

            if (segundo == 0) {
                System.out.println("Divisao impossivel");
            } else {
                double result = (double) primeiro / segundo;
                System.out.printf("%.1f%n", result);
            }
        }

        sc.close();
    }
}

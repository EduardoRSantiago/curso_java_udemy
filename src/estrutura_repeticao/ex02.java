package estrutura_repeticao;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0) {
                System.out.println("quarto");
            } else if (y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("segundo");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}

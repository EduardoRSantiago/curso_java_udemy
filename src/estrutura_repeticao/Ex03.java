package estrutura_repeticao;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0 , disel = 0;

        int n = sc.nextInt();

        while (n != 4) {
            switch (n) {
                case 1:
                    alcool ++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    disel++;
                    break;
            }

            n = sc.nextInt();
        }

        System.out.println("Muito Obrigado");
        System.out.println("Álcool " + alcool);
        System.out.println("Gasolina " + gasolina);
        System.out.println("Disel " + disel);

        sc.close();
    }
}

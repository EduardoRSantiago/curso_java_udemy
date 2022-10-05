package heranca_e_polimorfismo.application;

import heranca_e_polimorfismo.entities.ImporterdProduct;
import heranca_e_polimorfismo.entities.Product;
import heranca_e_polimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (type == 'c') {
                productList.add(new Product(name,price));

            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                productList.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();

                productList.add(new ImporterdProduct(name, price, customsFee));
            }

        }

        System.out.println("PRICE TAGS");
        for(Product product : productList) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}

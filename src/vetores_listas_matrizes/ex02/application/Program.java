package vetores_listas_matrizes.ex02.application;

import vetores_listas_matrizes.ex02.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        System.out.println();

        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.println();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            emp.increaseSalary(sc.nextDouble());
        }

        System.out.println();

        System.out.println("List of employees:");
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }

        sc.close();
    }
}

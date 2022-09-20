package vetores_listas_matrizes.ex01.application;

import vetores_listas_matrizes.ex01.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] rooms = new Student[10];

        System.out.print("How many rooms will be rented? ");
        int rented = sc.nextInt();

        for (int i=1; i<=rented; i++) {
            System.out.printf("Rent #%d:%n", i);

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int room = sc.nextInt();

            rooms[room] = new Student(name, email, room);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i]);
            }
        }

        sc.close();
    }
}

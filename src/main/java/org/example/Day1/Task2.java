package org.example.Day1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter with your age: ");
        int age = scanner.nextInt();
        boolean isValidAge = true;
        if (age > 0) {
            isValidAge = true;
        } else {
            System.out.println("Age must be a positive number. Try again");
            while (!isValidAge)
                try {
                    age = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Age must be a positive number. Try again");
                }
            return;
        }
                scanner.nextLine();

        System.out.println("Enter with your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter with your phone number: ");
        long phone = scanner.nextLong();

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My email is " + email);
        System.out.println("My phone number is " + phone);
    }
}

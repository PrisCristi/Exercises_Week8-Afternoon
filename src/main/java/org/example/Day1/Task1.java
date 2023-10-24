package org.example.Day1;

import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter with your age: ");
        int age = scanner.nextInt();
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

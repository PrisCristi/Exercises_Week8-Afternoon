package org.example.Day1;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter with your age: ");
        int age;
       while (true)
           try {
               age = Integer.parseInt(scanner.next());
               if (age > 0) {
                   break;

               } else {
                   System.out.println("Age must be a positive number. Try again");
               }
           } catch (NumberFormatException e) {
                    System.out.println("Age must be a positive number. Try again");
        }
            scanner.nextLine();
        System.out.println("Enter with your email: ");
        String email = scanner.nextLine();

        System.out.println("Enter with your phone number: ");
        long phone = scanner.nextLong();

        System.out.println("Enter with your address: ");
        String address = scanner.nextLine();
            scanner.nextLine();

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("My email is " + email);
        System.out.println("My phone number is " + phone);
        System.out.println("My address is " + address);

        try (FileWriter writer = new FileWriter("/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/src/main/java/org/example/userInfo.txt")){
                writer.write("UserInformation:\n");
                writer.write("My name is " + name);
                writer.write ("I am " + age + " years old");
                writer.write("My email is " + email);
                writer.write("My phone number is " + phone);
                writer.write("My address  " + address);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();

        } finally {
        scanner.close();
        }
    }
}

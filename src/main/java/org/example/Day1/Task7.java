package org.example.Day1;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Task7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileWriter writer = new FileWriter("userinfo.txt")) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            int age = Integer.parseInt(getUserInput(scanner, "age"));
            String email = getUserInput(scanner, "email");
            String phoneNumber = getUserInput(scanner, "phone number");
            String address = getUserInput(scanner, "address");
            String bookTitle = getUserInput(scanner, "favorite book title");
            String author = getUserInput(scanner, "author of the book");
            int publicationYear = Integer.parseInt(getUserInput(scanner, "publication year of the book"));

        } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                private static String getUserInput(Scanner scanner, String prompt) {
                    System.out.print("Enter your " + prompt + ": ");
                    return scanner.nextLine();
                }
            }




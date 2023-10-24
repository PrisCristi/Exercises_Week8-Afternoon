package org.example.Day1;
import java.util.Calendar;
import java.util.Scanner;
public class Task6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = 0;
            boolean isValidAge = false;
            while (!isValidAge) {
                try {
                    System.out.print("Enter your age: ");
                    age = Integer.parseInt(scanner.nextLine());
                    if (age > 0) {
                        isValidAge = true;
                    } else {
                        System.out.println("Age must be a positive integer. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Age must be a positive integer. Please try again.");
                }
            }
            int birthYear = currentYear - age;
            System.out.println("User's Birth Year: " + birthYear);
        }
}

package org.example.Day2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.nio.file.Files.delete;

public class Task7 {
    public static void main(String[] args) {
        System.out.print("Do you want to delete your information? (yes/no): ");
        Scanner scanner = new Scanner(System.in);
        String confirmation = scanner.nextLine().toLowerCase();
        if (confirmation.equals("yes")) {
            File file = new File("/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/src/main/java/org/example/Day2/favColor.txt");
            if (file.exists() && file.delete()) {
                System.out.println("User information deleted successfully.");
            } else {
                System.out.println("User information not deleted.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}

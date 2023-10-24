package org.example.Day2;

import java.io.*;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/src/main/java/org/example/Day1/userInfo.txt");
            if (file.exists()) {
                FileInputStream fileInput = new FileInputStream("userInfo.txt");
                InputStreamReader reader = new InputStreamReader(fileInput);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String phoneNumber = bufferedReader.readLine();
                String address = bufferedReader.readLine();
                bufferedReader.close();
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("Address: " + address);
                System.out.print("Do you want to delete your information? (yes/no): ");

                String confirmation = scanner.nextLine().toLowerCase();
                    if (confirmation.equals("yes")) {
                        file.delete();
                        System.out.println("User information deleted successfully.");
                    } else {
                        System.out.println("User information not deleted.");
                    }
                    } else {
                    System.out.println("File not found. Unable to delete user information.");
                }
            }catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
        }
    }
}


package org.example.Day2;
import java.io.*;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/src/main/java/org/example/Day2/userInfo2"))) {
           String line = reader.readLine();
           if (line!= null){
               try {
                   int age = Integer.parseInt(reader.readLine());
                   System.out.println("User Age: " + age);
                   updateAgeAndCategory();
               }catch (NumberFormatException e){
                   System.err.println("File does not contain a valid number");
               }
           }else{
               System.err.println("File is empty");
           }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void updateAgeAndCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to update your age? (yes/no): ");
        String confirmation = scanner.nextLine().toLowerCase();

        if (confirmation.equals("yes")) {
            System.out.print("Enter new age: ");
            int newAge = Integer.parseInt(scanner.nextLine());

            try (FileWriter fileWriter = new FileWriter("userInfo.txt")) {
                fileWriter.write(String.valueOf(newAge));
                System.out.println("Age updated successfully.");
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        }

        int age = Integer.parseInt(confirmation);
        String ageCategory = calculateAge(age);
        System.out.println("Age: " + ageCategory);
    }

    private static String calculateAge(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teenager";
        } else if (age < 65) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}

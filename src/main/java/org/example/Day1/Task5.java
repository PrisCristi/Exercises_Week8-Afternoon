package org.example.Day1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        String fileName = "/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/src/main/java/org/example/userInfo.txt";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                System.out.println("User Information:");
                String line;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        }


}

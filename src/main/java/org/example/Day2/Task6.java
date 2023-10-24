package org.example.Day2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/src/main/java/org/example/Day2/favColor.txt");
            InputStreamReader reader = new InputStreamReader(fileInput);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String favoriteColor = bufferedReader.readLine();
            System.out.println("Favorite Color: " + favoriteColor);
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}

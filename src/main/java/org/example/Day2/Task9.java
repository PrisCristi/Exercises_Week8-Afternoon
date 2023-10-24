package org.example.Day2;

import java.io.*;

public class Task9 {
    public static void main(String[] args) {

    try {
        FileInputStream fileInput = new FileInputStream("/Users/priscilasantos/Documents/StartSteps/Exercises_Week8-Afternoon/log.txt");
        InputStreamReader reader = new InputStreamReader(fileInput);
        BufferedReader bufferedReader = new BufferedReader(reader);
        int totalInteractions = 0;
        while (bufferedReader.readLine() != null) {
            totalInteractions++;
        }
        System.out.println("Total Interactions: " + totalInteractions);
    } catch (FileNotFoundException e) {
        System.err.println("Log file not found: " + e.getMessage());
    } catch (IOException e) {
        System.err.println("Error reading log file: " + e.getMessage());
    }
}
}

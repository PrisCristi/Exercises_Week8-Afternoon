package org.example.Day2;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("userInfo.txt");

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("userInfo.txt file created.");
            }

            FileInputStream fileInput = new FileInputStream("userInfo.txt");
            InputStreamReader reader = new InputStreamReader(fileInput);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String phoneNumber = bufferedReader.readLine();
            String address = bufferedReader.readLine();
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Address: " + address);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}


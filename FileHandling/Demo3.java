package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        File f1 = new File("Name.txt");
        try {
            Scanner scanner = new Scanner(f1);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}


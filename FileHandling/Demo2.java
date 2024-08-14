package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        File f1 = new File("Name.txt");
        try {
            if (f1.createNewFile() == true) {
                System.out.println("New file is created: " + f1.getName());
            
            } else {
                System.out.println("New file already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

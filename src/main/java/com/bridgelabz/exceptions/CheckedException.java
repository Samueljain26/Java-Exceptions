package com.bridgelabz.exceptions;
import java.io.*;
public class CheckedException {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("demo.txt")) {
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

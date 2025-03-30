package com.bridgelabz.exceptions;

import java.io.*;

public class FileRead {

        public static void main(String[] args) {
            try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
                String firstLine = br.readLine();
                System.out.println("First line: " + firstLine);
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        }
    }
/*Error reading file
 */
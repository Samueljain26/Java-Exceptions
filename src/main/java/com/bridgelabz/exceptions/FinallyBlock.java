package com.bridgelabz.exceptions;

import java.util.*;

public class FinallyBlock {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter num1: ");
                int num1 = sc.nextInt();

                System.out.print("Enter num2: ");
                int num2 = sc.nextInt();

                int result = num1 / num2;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: Cannot divide by zero.");
            } finally {
                System.out.println("Operation completed."); // Always executed
                sc.close();
            }
        }
    }
/*Enter num1: 2
Enter num2: 0
Error: Cannot divide by zero.
Operation completed.
 */
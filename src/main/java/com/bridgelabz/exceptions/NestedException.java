package com.bridgelabz.exceptions;

import java.util.*;

public class NestedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                int result = numbers[index] / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        }
    }
/*Enter array index: 3
Enter divisor: 0
Cannot divide by zero!
 */
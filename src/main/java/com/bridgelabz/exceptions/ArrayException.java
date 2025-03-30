package com.bridgelabz.exceptions;

import java.util.*;

public class ArrayException {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = {10, 20, 30, 40, 50};

            try {
                System.out.print("Enter index to retrieve value: ");
                int index = sc.nextInt();

                System.out.println("Value at index " + index + ": " + numbers[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
        }
    }
/*Enter index to retrieve value: 8
Invalid index!
 */
package com.bridgelabz.exceptions;

import java.util.*;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the num 1");
            int num1 = sc.nextInt();
            System.out.println("Enter the num 2");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(num1 + " % " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values only.");
        }
    }
}
/*Enter the num 1
4
Enter the num 2
0
Error: Cannot divide by zero.
 */
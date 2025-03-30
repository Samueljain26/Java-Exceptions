package com.bridgelabz.exceptions;

public class ExceptionPropagation {
    static void method1() {
        int result = 10 / 0;
    }

    // Method that calls method1()
    static void method2() {
        method1();
    }

    //calls method2() and handles the exception
    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
/*Handled exception in main
 */
package com.bridgelabz.exceptions;

import java.util.*;
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public class CustomException {
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above");
            }
            System.out.println("Access granted!");
        }

        public static void main(String[] args) {
            try {
                validateAge(17);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
/*Age must be 18 or above
 */
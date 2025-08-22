package Advance;

import java.util.Scanner;

public class CustomExceptionHandellingForInvalidAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Invalid age: " + age + ". Age must be between 0 and 120.");
            }
            System.out.println("Valid age: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Age validation completed.");
        }
    }
    
}

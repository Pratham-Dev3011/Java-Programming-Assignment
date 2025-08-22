package Intermidiate;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateValidator {
    
    // Simple function to validate date
    public static boolean isValidDate(String dateString) {
        try {
            LocalDate.parse(dateString);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a date (YYYY-MM-DD format):");
        String userInput = scanner.nextLine();
        
        if (isValidDate(userInput)) {
            System.out.println("Valid date: " + userInput);
        } else {
            System.out.println("Invalid date: " + userInput);
        }
        
        scanner.close();
    }
}
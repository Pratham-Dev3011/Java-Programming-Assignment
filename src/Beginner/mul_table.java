package Beginner;
import java.util.Scanner;

public class mul_table {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table Generator");
        
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            System.out.println("Please enter a valid positive integer.");
        }
        
        scanner.close();
        System.out.println("Thank you for using Multiplication Table Generator!");
        
    }
    }

package Beginner;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int choice;
        System.out.println("Welcome to the Menu Driven Program to add or substract two numbers");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your choice");
        choice= scanner.nextInt();
        if (choice<=4 && choice>=1) {
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number");
            int num2 = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("The difference of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Exiting the program. Thank you!");
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }
        scanner.close();
        System.out.println("Thank you for using the Menu Driven Program!");




    }
    
}

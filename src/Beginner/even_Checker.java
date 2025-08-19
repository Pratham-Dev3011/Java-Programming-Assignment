package Beginner;

import java.util.Scanner;

public class even_Checker {

    public static void main(String[] args) {
        System.out.println("Welcome to Even Checker");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to check if it is even or odd: ");
            try {
                int number = scanner.nextInt();
                if (isEven(number)) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        System.out.println("Thank you for using Even Checker!");
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
}

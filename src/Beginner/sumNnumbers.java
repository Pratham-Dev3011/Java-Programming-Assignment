package Beginner;

import java.util.Scanner;

public class sumNnumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sum of N naturals Numbers");
        
        System.out.print("Enter the number of elements you want to sum: ");
        int n = scanner.nextInt();
        if (n> 0)
         {
            int sum = 0;
            for (int i = 1; i <=n; i++) 
            {
                sum += i;
            }

            System.out.println("The sum of the entered numbers is: " + sum);
        } 
        else {
            System.out.println("Please enter a valid positive integer for the number of elements.");
        }
        scanner.close();
        System.out.println("Thank you for using Sum of N Numbers!");
    }
    
}

package Beginner;
import java.util.Scanner;
public class FindLargestOf3No { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Largest of Three Numbers Finder");

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3);
        System.out.println("The largest number is: " + largest);

        scanner.close();
        System.out.println("Thank you for using the Largest of Three Numbers Finder!");
    }

    public static int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}   
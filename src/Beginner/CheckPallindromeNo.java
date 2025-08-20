package Beginner;
import java.util.*;
public class CheckPallindromeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Palindrome Number Checker");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

        scanner.close();
        System.out.println("Thank you for using the Palindrome Number Checker!");
    }

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }
    
}

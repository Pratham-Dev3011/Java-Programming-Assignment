package Beginner;
import java.util.Scanner;

public class Number_Reverser {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number to be reversed:"+" ");
        int number = scanner.nextInt();
        System.out.println("");
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number is: " + reversedNumber);
        scanner.close();
        }
        catch(Exception e){
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        System.out.println("Thank you for using Number Reverser!");

    }
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
}

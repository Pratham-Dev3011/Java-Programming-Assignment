package Beginner;
import java.util.*;

public class SimpleCalculator {
public static void main(String[] args) {
    Scanner Sc= new Scanner(System.in);
    System.out.println("Welcome to Simple Calculator");
    System.out.println(" ");
    System.out.print("enter first no.");

    int num1= Sc.nextInt();
    System.out.println(" ");
    System.out.print("enter second no.");
    int num2 = Sc.nextInt();

    System.out.println(" choose one operator + - * /");
    char operator = Sc.next().charAt(0);
    int result;
    if (operator == '+') {
        result = num1 + num2;
        System.out.println("The sum is: " + result);
    } else if (operator == '-') {
        result = num1 - num2;
        System.out.println("The difference is: " + result);
    } else if (operator == '*') {
        result = num1 * num2;
        System.out.println("The product is: " + result);
    } else if (operator == '/') {
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("The quotient is: " + result);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    } else {
        System.out.println("Invalid operator. Please use +, -, *, or /.");
    }
    Sc.close();
    System.out.println("Thank you for using Simple Calculator!");



}
}

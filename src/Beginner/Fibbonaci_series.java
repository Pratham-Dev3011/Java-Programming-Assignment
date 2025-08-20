package Beginner;

import java.util.Scanner;

public class Fibbonaci_series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Fibonacci Series Generator");
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();  
        System.out.println("Fibonacci Series up to " + n + " terms:");
        generateFibonacci(n);
        scanner.close();
        System.out.println("Thank you for using the Fibonacci Series Generator!");
        
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
    
}

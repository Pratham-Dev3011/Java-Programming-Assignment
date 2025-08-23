package Advance;
import java.util.Scanner;



    


interface Operation {
    double execute(double a, double b);
}


class Add implements Operation {
    public double execute(double a, double b) {
        return a + b;
    }
}

class Subtract implements Operation {
    public double execute(double a, double b) {
        return a - b;
    }
}

class Multiply implements Operation {
    public double execute(double a, double b) {
        return a * b;
    }
}

class Divide implements Operation {
    public double execute(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }
}


public class OOPSCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Command-Line Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            Operation operation = null;

            switch (choice) {
                case 1: operation = new Add(); break;
                case 2: operation = new Subtract(); break;
                case 3: operation = new Multiply(); break;
                case 4: operation = new Divide(); break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (operation != null) {
                try {
                    double result = operation.execute(num1, num2);
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        scanner.close();
    }
}

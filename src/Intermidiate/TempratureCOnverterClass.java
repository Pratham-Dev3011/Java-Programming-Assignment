package Intermidiate;

import java.util.Scanner;

public class TempratureCOnverterClass {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble(); // Example temperature in Celsius
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
        System.out.println("You can now close the program.");
        System.out.println("Have a great day! 😊");
        
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}

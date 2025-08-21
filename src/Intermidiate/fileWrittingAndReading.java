package Intermidiate;
import java.io.*;
import java.util.Scanner;


public class fileWrittingAndReading {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wlcome to file reader and writer");
        System.out.println("1. Write to file");
        System.out.println("2. Read from file");
        int choice;
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                writeToFile();
                break;
            case 2:
                readFromFile();
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
        scanner.close();

    }
    private static void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to write to: ");
        String fileName = scanner.nextLine();
        try { 
            FileWriter fileWriter = new FileWriter("text.txt", true);
            System.out.println("Enter you text you want to write to the file");
            String text = scanner.nextLine();
            fileWriter.write(text + "\n");
            fileWriter.close();
            System.out.println("***/Text written to file successfully./***");

        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
    private static void readFromFile() {
        try {
            FileReader fileReader = new FileReader("text.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        System.out.println("***/File read successfully./***");
        System.out.println("Thank you for using the file reader and writer.");


}
}




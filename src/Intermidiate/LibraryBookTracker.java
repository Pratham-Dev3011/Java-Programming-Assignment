package Intermidiate;

import java.util.Scanner;


class book {
    String title;
    String author;
    int Year;


    book(String title, String author, int Year) {
        this.title = title;
        this.author = author;
        this.Year = Year;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + Year);
    }
}

public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        book[] library=new book[100];
        int count=0;
        int choice;

        do { 
            System.out.println("Library Book Tracker");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int year = scanner.nextInt();
                    library[count++] = new book(title, author, year);
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        library[i].display();
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
        System.out.println("Thank you for using the Library Book Tracker!");
        
    }

}
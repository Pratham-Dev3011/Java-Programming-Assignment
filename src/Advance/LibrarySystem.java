package Advance;


import java.util.ArrayList;
import java.util.Scanner;



class Book {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkout() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return title + (isAvailable ? " (Available)" : " (Checked Out)");
    }
}


class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("\n===== Library Books =====");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    public void checkoutBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (book.isAvailable()) {
                book.checkout();
                System.out.println("You checked out: " + book.getTitle());
            } else {
                System.out.println("Book already checked out.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isAvailable()) {
                book.returnBook();
                System.out.println("You returned: " + book.getTitle());
            } else {
                System.out.println("Book was not checked out.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

    
        library.addBook("The Great Gatsby");
        library.addBook("1984");
        library.addBook("To Kill a Mockingbird");
        library.addBook("The Catcher in the Rye");

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. View Books");
            System.out.println("2. Checkout Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.viewBooks();
                    break;
                case 2:
                    library.viewBooks();
                    System.out.print("Enter book number to checkout: ");
                    int checkoutIndex = scanner.nextInt() - 1;
                    library.checkoutBook(checkoutIndex);
                    break;
                case 3:
                    library.viewBooks();
                    System.out.print("Enter book number to return: ");
                    int returnIndex = scanner.nextInt() - 1;
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.println("Exiting Library System.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

    


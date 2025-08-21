package Intermidiate;

import java.util.Scanner;

public class simpleToDoListWithArrayList {
    public static void main(String[] args) {
        // Create an ArrayList to hold the to-do items
        java.util.ArrayList<String> todoList = new java.util.ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Simple To-Do List Application!");
            // Display the menu
            System.out.println("To-Do List Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline  
            switch (choice) {
                case 1 -> {
                    // Add Item
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    todoList.add(itemToAdd);
                    System.out.println("Item added: " + itemToAdd);
            }
                case 2 -> {
                    // Remove Item
                    System.out.print("Enter the item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (todoList.remove(itemToRemove)) {
                        System.out.println("Item removed: " + itemToRemove);
                    } else {
                        System.out.println("Item not found: " + itemToRemove);
                    }
            }
                case 3 -> {
                    // Display Items
                    System.out.println("To-Do List Items:");
                    for (String item : todoList) {
                        System.out.println("- " + item);
                    }
            }
                case 4 -> {
                    // Exit
                    System.out.println("Exiting...");
                    return;
            }
                default -> System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        System.out.println("Thank you for using the Simple To-Do List Application!");

}
}


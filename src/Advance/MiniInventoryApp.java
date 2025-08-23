package Advance;
import java.util.ArrayList;
import java.util.Scanner;

// Item class
class Item {
    private int id;
    private String name;
    private int stock;
    private double price;

    public Item(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getStock() { return stock; }
    public double getPrice() { return price; }

    public void setStock(int stock) { this.stock = stock; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "ID: " + id +
               " | Name: " + name +
               " | Stock: " + stock +
               " | Price: ₹" + price;
    }
}

// Inventory class
class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    // Add item
    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item added: " + item.getName());
    }

    // Delete item by ID
    public void deleteItem(int id) {
        Item itemToRemove = findItemById(id);
        if (itemToRemove != null) {
            items.remove(itemToRemove);
            System.out.println("Item removed: " + itemToRemove.getName());
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update stock and price
    public void updateItem(int id, int newStock, double newPrice) {
        Item item = findItemById(id);
        if (item != null) {
            item.setStock(newStock);
            item.setPrice(newPrice);
            System.out.println("✏ Item updated: " + item.getName());
        } else {
            System.out.println("Item not found.");
        }
    }

    // View all items
    public void viewItems() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n===== Inventory Items =====");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    // Helper: find item by ID
    private Item findItemById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}

// Main class
public class MiniInventoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n===== Inventory Menu =====");
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Update Item");
            System.out.println("4. View Items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Stock: ");
                    int stock = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    inventory.addItem(new Item(id, name, stock, price));
                    break;
                case 2:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    inventory.deleteItem(deleteId);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new Stock: ");
                    int newStock = scanner.nextInt();
                    System.out.print("Enter new Price: ");
                    double newPrice = scanner.nextDouble();
                    inventory.updateItem(updateId, newStock, newPrice);
                    break;
                case 4:
                    inventory.viewItems();
                    break;
                case 5:
                    System.out.println("Exiting Inventory System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

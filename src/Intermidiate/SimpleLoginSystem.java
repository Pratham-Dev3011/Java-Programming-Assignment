package Intermidiate;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        // Store username-password pairs
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("user1", "pass1");
        users.put("guest", "guest123");

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Login System ===");
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Check if username exists and password matches
        if (users.containsKey(username)) {
            if (users.get(username).equals(password)) {
                System.out.println("Login successful! Welcome, " + username + " 👋");
            } else {
                System.out.println("Invalid password ❌");
            }
        } else {
            System.out.println("User not found ❌");
        }

        sc.close();
    }
}

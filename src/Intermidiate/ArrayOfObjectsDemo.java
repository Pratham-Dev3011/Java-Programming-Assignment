package Intermidiate;
import java.util.Scanner;

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user how many students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Create array of Student objects
        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Create object and store in array
            students[i] = new Student(name, rollNo, age);
        }

        // Display all students
        System.out.println("\n=== Student Details ===");
        for (Student s : students) {
            s.display();
        }

        scanner.close();
    }
}

// Student class
class Student {
    private String name;
    private int rollNo;
    private int age;

    // Constructor
    Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Display method
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Age: " + age);
    }
}

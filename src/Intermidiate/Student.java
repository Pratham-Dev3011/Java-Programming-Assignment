package Intermidiate;

public class Student {
    private String name;
    private int age;
    private int rollNo;
    private String subject; // fixed naming convention

    // Constructor
    public Student(String name, int age, int rollNo, String subject) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.subject = subject;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Method to display info
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject: " + subject);
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, 101, "Computer Science");
        student.displayStudentInfo();

        // Example of using setters
        student.setSubject("Mathematics");
        student.setAge(21);

        System.out.println("\nAfter update:");
        student.displayStudentInfo();
    }
}

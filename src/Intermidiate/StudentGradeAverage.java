package Intermidiate;

import java.util.Scanner;

public class StudentGradeAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        double totalGrades = 0.0;
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            double grade = scanner.nextDouble();
            totalGrades += grade;
        }
        double average = totalGrades / numberOfStudents;
        System.out.printf("The average grade of the students is: %.2f%n", average);
        scanner.close();        
        
    }
    
}

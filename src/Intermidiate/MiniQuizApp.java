package Intermidiate;
import java.util.Scanner;

public class MiniQuizApp {
    
    // Simple function to run the quiz
    public static int runQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        // Question 1
        System.out.println("Question 1: What does HTML stand for?");
        System.out.println("1. HyperText Markup Language");
        System.out.println("2. Home Tool Markup Language");
        System.out.println("3. Hyperlinks Text Markup Language");
        System.out.print("Your answer (1-3): ");
        int answer1 = scanner.nextInt();
        if (answer1 == 1) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! Correct answer is 1.\n");
        }
        
        // Question 2
        System.out.println("Question 2: Which programming language is known as 'Write Once, Run Anywhere'?");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.println("3. C++");
        System.out.print("Your answer (1-3): ");
        int answer2 = scanner.nextInt();
        if (answer2 == 2) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! Correct answer is 2.\n");
        }
        
        // Question 3
        System.out.println("Question 3: What does CPU stand for?");
        System.out.println("1. Central Processing Unit");
        System.out.println("2. Computer Personal Unit");
        System.out.println("3. Central Program Unit");
        System.out.print("Your answer (1-3): ");
        int answer3 = scanner.nextInt();
        if (answer3 == 1) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! Correct answer is 1.\n");
        }
        
        return score;
    }
    
    // Simple function to calculate and display results
    public static void displayResults(int score, int totalQuestions) {
        System.out.println("Quiz Results:");
        System.out.println("Score: " + score + "/" + totalQuestions);
        
        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Percentage: " + percentage + "%");
        
        if (percentage >= 80) {
            System.out.println("Excellent!");
        } else if (percentage >= 60) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practicing!");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Mini Quiz!");
        System.out.println("Answer the following questions:\n");
        
        int finalScore = runQuiz();
        displayResults(finalScore, 3);
    }
}
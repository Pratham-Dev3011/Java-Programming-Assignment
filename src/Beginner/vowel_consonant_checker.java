package Beginner;

public class vowel_consonant_checker {
    
    public static void main(String[] args) {
        try {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a character to check if it is a vowel or consonant: ");
        char ch = scanner.next().charAt(0);
        
        if (isVowel(ch)) {
            System.out.println(ch + " is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input. Please enter an alphabetic character.");
        
        }
        scanner.close();
    }
        catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid character.");
        }
        System.out.println("Thank you for using Vowel and Consonant Checker!");
        
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}

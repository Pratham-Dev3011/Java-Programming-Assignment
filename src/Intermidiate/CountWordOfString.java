package Intermidiate;
import java.util.*;
public class CountWordOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String str = scanner.nextLine();
        int wordCount = countWords(str);
        System.out.println("");
        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }

    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}

package Advance;
import java.util.*;


public class LambdaExpressionBasics {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);

        System.out.println("Original List: " + numbers);

        // Sort the list in ascending order using lambda
        Collections.sort(numbers, (a, b) -> a - b);
        System.out.println("Sorted in Ascending Order: " + numbers);

        // Sort the list in descending order using lambda
        Collections.sort(numbers, (a, b) -> b - a);
        System.out.println("Sorted in Descending Order: " + numbers);
    }
}

    


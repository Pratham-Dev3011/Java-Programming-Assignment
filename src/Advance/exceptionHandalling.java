package Advance;

public class exceptionHandalling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array.");
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
    }
    
}

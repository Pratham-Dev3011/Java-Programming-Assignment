package Intermidiate;

import java.util.Arrays;
import java.util.Scanner;

public class sortanIntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array before sorting:"+Arrays.toString(arr));
        sortArray(arr);
        scanner.close();


        




        
        
    }
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}

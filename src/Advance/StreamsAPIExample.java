package Advance;
import java.util.*;
import java.util.stream.*;

public class StreamsAPIExample {
    
    
    public static List<String> filterNamesStartingWithA(List<String> names) {
        return names.stream()
                   .filter(name -> name.startsWith("A"))
                   .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        
        
        List<String> names = Arrays.asList(
            "Alice", "Bob", "Andrew", "Charlie", "Anna", 
            "David", "Amy", "Edward", "Alexander", "Sophie"
        );
        
        System.out.println("Original list of names:");
        names.forEach(System.out::println);
        
        System.out.println("\n=== Basic Filtering ===");
        
        

        List<String> namesWithA = names.stream()
                                       .filter(name -> name.startsWith("A"))
                                       .collect(Collectors.toList());
        
        System.out.println("Names starting with 'A':");
        namesWithA.forEach(System.out::println);
        
        
}
}
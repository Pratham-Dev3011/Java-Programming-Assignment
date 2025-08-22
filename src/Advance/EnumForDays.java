package Advance;
import java.util.*;
public class EnumForDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week (e.g., MONDAY): ");
        String input = scanner.nextLine().toUpperCase();
        try {
            Day selectedDay = Day.valueOf(input);
            System.out.println("You selected: " + selectedDay);
            System.out.println("Day type: " + selectedDay.getDayType());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day of the week.");
        }
    }

}

  enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    public boolean isWeekend() 
    {
        return this == SATURDAY || this == SUNDAY;
    }
    
    public String getDayType() 
    {
        return isWeekend() ? "Weekend" : "Weekday";
    }
}
    


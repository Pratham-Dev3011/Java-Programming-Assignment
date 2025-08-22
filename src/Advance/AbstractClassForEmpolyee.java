package Advance;

abstract class Employee {
    protected String name;
    protected double salary;
    

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    

    public String getName() {
        return name;
    }
    
    
  
    
    
    public abstract double calculateBonus();
    
    
    public double getTotalCompensation() {
        return salary + calculateBonus();
    }
    
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: $" + String.format("%.2f", salary));
        System.out.println("Bonus: $" + String.format("%.2f", calculateBonus()));
        System.out.println("Total Compensation: $" + String.format("%.2f", getTotalCompensation()));
    }
}





class Developer extends Employee {
    private int projectsCompleted;
    
    public Developer(String name, double salary, int projectsCompleted) {
        super(name, salary);
        this.projectsCompleted = projectsCompleted;
    }
    
    @Override
    public double calculateBonus() {
        return (salary * 0.10) + (projectsCompleted * 1000);
    }
    
    public int getProjectsCompleted() {
        return projectsCompleted;
    }
}

public class AbstractClassForEmpolyee{
    public static void main(String[] args) {
        Developer developer = new Developer("Bob Smith", 70000, 3);
        
        
        System.out.println("=== EMPLOYEE INFORMATION ===\n");
        
    
        System.out.println("--- DEVELOPER ---");
        developer.displayInfo();
        System.out.println("Projects Completed: " + developer.getProjectsCompleted());
        System.out.println();
        Employee[] employees = {
            new Developer("Alice Johnson", 80000, 5),
            new Developer("Bob Smith", 70000, 3),
            new Developer("Charlie Brown", 90000, 7)
        };
        
        double totalCompensation = 0;
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Bonus: $" + 
                String.format("%.2f", emp.calculateBonus()));
            totalCompensation += emp.getTotalCompensation();
        }
        
        System.out.println("\nTotal Company Compensation: $" + 
            String.format("%.2f", totalCompensation));
    }
}
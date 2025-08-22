package Advance;

interface Shape {
    String getShapeName();
    double perimeter();
    double area();
}

class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String getShapeName() {
        return "Circle";
    }
    
    @Override
    public double perimeter() { 
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double area() { 
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public String getShapeName() {
        return "Rectangle";
    }
    
    @Override
    public double perimeter() { 
        return 2 * (length + width);
    }
    
    @Override
    public double area() { 
        return length * width;
    }
}


public class InterfaceShape { 
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Shape: " + circle.getShapeName());
        System.out.println("Perimeter: " + circle.perimeter());
        System.out.println("Area: " + circle.area());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Shape: " + rectangle.getShapeName());
        System.out.println("Perimeter: " + rectangle.perimeter());
        System.out.println("Area: " + rectangle.area());
    }

    
}

package Advance;




class vehical {
    String brand;
    String model;
    String color;

    vehical(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }





}

class Car extends vehical {
    String TypeOfVehicle;

    Car(String brand, String model, String color, String TypeOfVehicle) {
        super(brand, model, color);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.TypeOfVehicle= TypeOfVehicle;
    }

    void displayCarInfo() {
        displayInfo();
        System.out.println("TypeOfVehical " + TypeOfVehicle);
    }
}



class bike extends vehical {
    String TypeOfVehicle;

    bike(String brand, String model, String color, String TypeOfVehicle) {
        super(brand, model, color);
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.TypeOfVehicle= TypeOfVehicle;
    }

    void displayBikeInfo() {
        displayInfo();
        System.out.println("TypeOfVehical " + TypeOfVehicle);
    }
}














public class InheritanceForvehicalClass {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "Red", "car");
        car.displayCarInfo();

        bike bike = new bike("Yamaha", "FZ", "Blue", "bike");
        bike.displayBikeInfo();
    }


}

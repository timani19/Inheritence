package Inheritence;

public class Dell extends Laptop {
    String brand;
    String model;
    double price;

    public double getPrice(double price){
        System.out.println("Laptop Price: " + price);
        return price;
    }

}

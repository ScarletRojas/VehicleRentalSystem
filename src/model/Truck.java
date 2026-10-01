package model;

public class Truck extends Vehicle {
    public Truck() {
        rate = 80; // rate for the truck 80
    }

    public double calculateRent(int days) {
        return rate * days; // multiply 80 times user input
    }
}

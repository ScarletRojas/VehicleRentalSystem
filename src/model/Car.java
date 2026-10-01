package model;

public class Car extends Vehicle {
    public Car() {
        rate = 50; // the rate for the car is 50
    }

    public double calculateRent(int days) {
        return rate * days; // will multiply 50 times user input
    }
}

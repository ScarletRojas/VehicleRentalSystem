package model;

public class Bike extends Vehicle {
    public Bike() {
        rate = 20; // rate for the bike is 20
    }

    public double calculateRent(int days) {
        return rate * days; // will multiply 20 times user input
    }
}

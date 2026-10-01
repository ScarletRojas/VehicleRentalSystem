package model;

public abstract class Vehicle {
    protected double rate;
    // The asbtract class must be implemented by any subclass of Vehicle
    public abstract double calculateRent(int days);
}

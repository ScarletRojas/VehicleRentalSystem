package service;

import model.*;

public class VehicleService {
    public static Vehicle getVehicle(String type) {
        switch (type) {
            case "Car": return new Car();
            case "Bike": return new Bike();
            case "Truck": return new Truck();
            case "InsuredCar": return new InsuredCar();
            default: throw new IllegalArgumentException("Invalid type");
        }
    }
}
    /**
     * Returns a specific type of Vehicle object based on the given type
     * @param type the type of vehicle to create
     * @return a Vehicle object corresponding to the given type
     * @throws IllegalArgumentException if the type is not recognized
     */
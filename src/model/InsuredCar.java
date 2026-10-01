package model;

public class InsuredCar extends Car implements Insurable {
    public double getInsuranceCost(int days) {
        // If the user selec the insured car is gonna be 10$ more per day
        return 10 * days;
    }

    public double calculateRent(int days) {
        //The calculation to add basic car rent + insurense
        return super.calculateRent(days) + getInsuranceCost(days);
    }
}

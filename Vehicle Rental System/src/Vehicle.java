/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xyjor
 */
public abstract class Vehicle {

    protected String make, model;

    protected double rentalPrice;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;

    }

    public void displaydetails() {
        System.out.println("Vehicle Details: ");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental price per day: " + rentalPrice);
    }

    public double calculateRentalCost(int days) {
        
        return rentalPrice * days;
    }

    public double calculateDiscountedREntalCost(int days, double discountPercentage) {
        double discount;
        if (days > 3) {
            discountPercentage = 0.15;
            discount = (rentalPrice * days) - ((rentalPrice * days) * discountPercentage);
            System.out.println("Rental period exceeds 3 days; additional 5% discount on rental price! Congrats!\nOverall discount --- 15%");
            System.out.println("Final rental cost: " + discount);
        } else {
            discountPercentage = 0.10;
            discount = (rentalPrice * days) - ((rentalPrice * days) * discountPercentage);
            System.out.println("You have 10$ discount price from \"Event Discount\"!");
            System.out.println("Final rental cost: " + discount);
        }
        return discount;
    }
    
    public abstract void performMaintenance();

}


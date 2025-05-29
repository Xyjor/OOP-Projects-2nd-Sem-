/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xyjor
 */
public class Truck extends Vehicle {

    private double payLoadCapacity;

    @Override
    public void performMaintenance() {
        System.out.println("Checking payload systems and engine oil for the truck.....\n");
    }

    public Truck(String make, String model, double rentalPrice, double payLoadCapacity) {
        super(make, model, rentalPrice);
        this.payLoadCapacity = payLoadCapacity;
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("Payload Capacity: " + payLoadCapacity + " tons");
    }

}

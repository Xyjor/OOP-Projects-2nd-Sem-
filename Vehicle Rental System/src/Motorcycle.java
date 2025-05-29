/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Xyjor
 */
public class Motorcycle extends Vehicle {

    private boolean hasRentalHelmet;

    @Override
    public void performMaintenance() {
        System.out.println("Inspecting brakes and tire pressure for the motorcycle.....\n");
    }

    public Motorcycle(String make, String model, double rentalPrice, boolean hasRentalPrice) {
        super(make, model, rentalPrice);
        this.hasRentalHelmet = hasRentalPrice;
    }

    public void displayDetails() {
        super.displaydetails();
        System.out.println("Helmet Rental Available: " + (hasRentalHelmet ? "Yes" : "No"));
    }

}

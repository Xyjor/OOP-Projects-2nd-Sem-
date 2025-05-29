
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Xyjor
 */
public class RentalTestSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[4];

        int days;
        boolean continueRental;

        vehicles[0] = new Car("Toyota", "Camry", 50, 4);
        vehicles[1] = new Truck("Ford", "F-150", 80, 2.5);
        vehicles[2] = new Motorcycle("Harley-Davidson", "Street 750", 40, true);
        ElectricCar v = new ElectricCar("Elon Mux", "Tesla", 95, 1500);

        System.out.println("""
                                WELCOME TO VEHICLE RENTAL HOUZE!
                           ------------------------------------------
                           *We currently have an event discount of 10%!*
                           -> 1 month from now the rental price will be discounted by 10%!
                                                    ***AND*** 
                              If you rent a vehicle with a 4 days span or longer, there 
                              will be an additional 5% discount! So the overall discount 
                              will going to be a whooping 15%!!!
                           ------------------------------------------
                           
                           """);

        
        do {
            
            System.out.println("""
                               Choose a vehicle that you want to rent:
                               [1] Car
                               [2] Motorcycle
                               [3] Truck
                               [4] Electric Car
                               - - - - - - - - - - - - - - - - - - - -
                               [0] Exit
                               """);
            
            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("""
                                   Exiting...............
                                   
                                   "Come back again!"
                                   """);
                    break;
                case 1:
                    System.out.print("Input the days you want to rent: ");
                    days = in.nextInt();

                    vehicles[0].performMaintenance();

                    vehicles[0].displaydetails();

                    System.out.println("Rental cost for " + days + " day/s: $" + vehicles[0].calculateRentalCost(days));

                    vehicles[0].calculateDiscountedREntalCost(days, 0);
                    System.out.println("-----------------------------------");
                    break;
                case 2:
                    System.out.print("Input the days you want to rent: ");
                    days = in.nextInt();

                    vehicles[2].performMaintenance();

                    vehicles[2].displaydetails();

                    System.out.println("Rental cost for " + days + " day/s: $" + vehicles[2].calculateRentalCost(days));

                    vehicles[2].calculateDiscountedREntalCost(days, 0);
                    System.out.println("-----------------------------------");

                    break;
                case 3:
                    System.out.print("Input the days you want to rent: ");
                    days = in.nextInt();

                    vehicles[1].performMaintenance();

                    vehicles[1].displaydetails();

                    System.out.println("Rental cost for " + days + " day/s: $" + vehicles[1].calculateRentalCost(days));

                    vehicles[1].calculateDiscountedREntalCost(days, 0);
                    System.out.println("-----------------------------------");

                    break;
                case 4:
                    System.out.print("Input the days you want to rent: ");
                    days = in.nextInt();

                    v.performMaintenance();

                    v.displayDetails();

                    System.out.println("Rental cost for " + days + " day/s: $" + v.calculateRentalCost(days));

                    v.calculateDiscountedREntalCost(days, 0);
                    System.out.println("-----------------------------------");
                    break;

                default:
                    System.out.println("You've put an invalid number... please choose a valid one.");
            }

            System.out.println("""
                               Do you want to continue at shop?
                               Type "y" if yes, then "n" if no
                               """);
            String choys = in.next();

            if (choys.equalsIgnoreCase("y")) {
                continueRental = true;
            } else {
                continueRental = false;
            }

        } while (continueRental);

        System.out.println("""
                                   Exiting...............
                                   
                                   "Come back again!"
                                   """);
    }

}
//
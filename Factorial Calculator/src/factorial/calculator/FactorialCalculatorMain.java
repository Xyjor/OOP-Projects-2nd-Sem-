/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial.calculator;

import java.util.Scanner;

/**
 *
 * @author YANGYANG_CpE121
 */
public class FactorialCalculatorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean Return;
        do {
            System.out.println("""
                           Welcome to the "Factorial Calculator" where you can find the factorial of a number by
                           just inputting the number (Non-integer Number) you want.
                           
                           Enter a number (Non-integer) to find it's factorial:
                           
                           """);

            int n = in.nextInt();
            if (n < 0) {
                System.out.println("INVALID!!!\nThe number should be non-negative");
            } else {
                FactorialCalculatorClass f = new FactorialCalculatorClass(n);
                f.displayResult();
            }
            
            System.out.println("Do you want to continue using the \"Factorial Calculator?\"\n"
            + "If Yes input \"Y\" if no input \"N\"");
            String Choice = in.next();
            
            if (Choice.equalsIgnoreCase("y")) {
                Return = true;
            }else{
            Return = false;
            }
            
        } while (Return);
        
        System.out.println("Thank you for using the factorial calculator!");
    }

}

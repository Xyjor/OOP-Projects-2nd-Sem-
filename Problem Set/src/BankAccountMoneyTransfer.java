
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Xyjor
 */
public class BankAccountMoneyTransfer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BankAccount acc1 = new BankAccount("9137558", 600.0);
        BankAccount acc2 = new BankAccount("9171695", 500.0);

        // Display balances before transfer
        System.out.println("Before Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        // Perform transfer
        Bank bank = new Bank();
        System.out.print("Type the amount of money you want to transfer: $ ");
        double money = in.nextDouble();
        bank.transferMoney(acc1, acc2, money);

        // Display balances after transfer
        System.out.println("\nAfter Transfer:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Xyjor
 */
public class FinalProjectMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new UserForm().setVisible(true);
        JOptionPane.showMessageDialog(null, "Welcome to the Inventory Management!");
        JOptionPane.showMessageDialog(null, "Please Login first in order to access the Inventory");
    }
    
}

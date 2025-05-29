/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author YANGYANG_CpE121
 */
public class SASClass1 {

    private int nnn;

    public SASClass1(int nnn) {
        this.nnn = nnn;
    }

    public int calculatSum() {
        int num = 0;
        for (int i = 1; i <= nnn; i++) {
            num += i;
        }
        return num;
    }

    public void displayResult() {
        int sum = calculatSum();
        System.out.println("The Sum of the Arithmetic sequence is: " + sum);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial.calculator;

/**
 *
 * @author YANGYANG_CpE121
 */
public class FactorialCalculatorClass {

    private int n;

    public FactorialCalculatorClass(int n) {
        this.n = n;
    }

    public long calculateFactorial() {
        if (n == 0) {
            return 1;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public void displayResult() {
        System.out.println("The factorial of: " + n + "\n is: " + calculateFactorial());
    }

}

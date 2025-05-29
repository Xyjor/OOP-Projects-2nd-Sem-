/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StudentTransferBetweenClassrooms;

/**
 *
 * @author Xyjor
 */
public class SchoolTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Classroom A = new Classroom("|Block [ ECE ]|");
        Classroom B = new Classroom("|Block [ CoE ]|");

        Student num1 = new Student("Daryl Carillo", 13231);
        Student num2 = new Student("Naldrelle Brioness", 25334);
        Student num3 = new Student("James Anthony Villacorta", 36673);

        A.addStudent(num1);
        B.addStudent(num2);
        A.addStudent(num3);

        System.out.println("Before Transfer: ");
        A.displayStudents();
        B.displayStudents();

        A.transferStudent(num1, B);
        B.transferStudent(num2, A);
        A.transferStudent(num3, B);

        System.out.println("\nAfter Transfer: ");
        A.displayStudents();
        B.displayStudents();

    }

}

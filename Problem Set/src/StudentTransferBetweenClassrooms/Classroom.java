/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentTransferBetweenClassrooms;

import java.util.ArrayList;

/**
 *
 * @author Xyjor
 */
public class Classroom {

    private String className;
    private ArrayList<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudents() {
        System.out.println("Class: " + className);
        if (students.isEmpty()) {
            System.out.println("No Students enrolled.");
        } else {
            for (Student s : students) {
                s.displayInfo();
            }
        }
        System.out.println();
    }

    public void transferStudent(Student student, Classroom newclassroom) {
        if (students.contains(student)) {
            this.removeStudent(student);
            newclassroom.addStudent(student);
            System.out.println("Transferred student: " + student.getName() + " from "
                    + this.className + " to " + newclassroom.className);
        } else {
            System.out.println("Student not found in " + this.className);
        }
    }
}

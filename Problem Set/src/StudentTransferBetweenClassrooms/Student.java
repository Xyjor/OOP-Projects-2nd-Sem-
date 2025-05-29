/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentTransferBetweenClassrooms;

/**
 *
 * @author Xyjor
 */
public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void displayInfo(){
        System.out.println("ID: " + id + "\nName: " + name);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    
}

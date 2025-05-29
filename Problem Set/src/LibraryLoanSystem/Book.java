/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryLoanSystem;

/**
 *
 * @author Xyjor
 */
public class Book {

    private String title;
    private String author;
    private int copies;

    // Constructor
    public Book(String title, String author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    // Display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Copies available: " + copies);
        System.out.println();
    }

    // Decrement available copies
    public void decrementCopies(int count) {
        if (count > 0 && count <= copies) {
            copies -= count;
        } else {
            System.out.println("Not enough copies available for: " + title);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LibraryLoanSystem;

/**
 *
 * @author Xyjor
 */
public class LibraryReception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book b1 = new Book("Vagabond", "Takehiko Inoue", 15);
        Book b2 = new Book("The Fable", "Katsuhisa Minami", 3);
        Book b3 = new Book("Blue Lock", "Muneyuki Kaneshiro", 8);

        // Add books to library
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        // Display before loan
        System.out.println("Before Loan:");
        library.displayLibrary();

        // Loan some books
        library.loanBook(b1, 12); // Loan 12 copies of Vagabond
        library.loanBook(b2, 3); // Loan 3 copy of The Fable
        library.loanBook(b3, 5); // Loan 5 copy of Blue Lock 
       
        // Display after loan
        System.out.println("--------------------------------------"
                + "\nAfter Loan:");
        library.displayLibrary();
    }

}

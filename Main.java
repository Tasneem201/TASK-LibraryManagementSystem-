
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Alchemist", "Paulo Coelho");


        EBook ebook1 = new EBook("Java Programming", "James Gosling", 5.2);


        System.out.println("Library System Demo:\n");


        book1.borrow();      // First time
        book1.borrow();      // Already borrowed
        book1.returnBook();
        book1.returnBook();  // Already returned

        System.out.println();


        ebook1.borrow();
    }
}


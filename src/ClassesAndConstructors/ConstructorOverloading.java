package ClassesAndConstructors;

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        title = "XYZ";
        author = "MNO";
        price = 20.0;
    }

    // Parameterized constructor with one argument
    Book(String title) {
        this.title = title;
        author = "XYZ";
        price = 15.0;
    }

    // Parameterized constructor with two arguments
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        price = 5.0;
    }

    // Parameterized constructor with all arguments
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Book book1 = new Book();
        book1.display();

        Book book2 = new Book("Java Basics");
        book2.display();

        Book book3 = new Book("Java Basics", "John Doe");
        book3.display();

        Book book4 = new Book("Java Basics", "John Doe", 29.99);
        book4.display();
    }
}


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(" The Lord of the Rings", "J.R.R. Tolkien", 281);
        Book book2 = new Book("1984", "On the Origin of Species", 328);
        Book book3 = new Book("War And Peace", "Harry Potter Series.", 96);

        System.out.println();
        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        System.out.println();
        book2.displayInfo();
        book2.borrowBook();
        book2.displayInfo();
        book2.returnBook();
        book2.displayInfo();

        System.out.println();
        book3.displayInfo();
        book3.borrowBook();
        book3.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}

class Book {
    String title, author;
    int pages;
    boolean isAvailable = true;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    void borrowBook() {
        isAvailable = false;
        System.out.println("You have borrowed '" + title + "'.");
    }

    void returnBook() {
        isAvailable = true;
        System.out.println("You have returned '" + title + "'.");
    }
}
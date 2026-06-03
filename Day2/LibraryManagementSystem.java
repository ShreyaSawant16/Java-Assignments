package oopconcepts;

interface LibraryActions {
    void issueBook();
}

abstract class Library {
    abstract void display();
}

class Book extends Library implements LibraryActions {
    private String bookName = "Java Programming";

    public void setBookName(String name) {
        bookName = name;
    }

    public String getBookName() {
        return bookName;
    }

    void display() {
        System.out.println("Book: " + bookName);
    }

    public void issueBook() {
        System.out.println("Book issued successfully");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book();
        b.display();
        b.issueBook();
    }
}
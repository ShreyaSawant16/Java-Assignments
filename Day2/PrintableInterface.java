package oopconcepts;


interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

public class PrintableInterface {
    public static void main(String[] args) {
        Document d = new Document();
        d.print();
    }
}
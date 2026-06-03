package oopconcepts;

// Student class (same file)
 class Student1 {
    private int id;
    private String name;
    private int marks;

    // Constructor
    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks!");
        }
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

// Main class (ONLY public class)
public class StudentManagementSystems {
    public static void main(String[] args) {

        Student1 s1 = new Student1(1, "Shreya", 90);
        Student1 s2 = new Student1(2, "Rohit", 75);

        s1.display();
        s2.display();

        s2.setMarks(85);
        s2.setName("Rohit Sharma");

        System.out.println("After Update:");
        s2.display();
    }
}
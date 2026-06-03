package oopconcepts;

// Abstract class
abstract class Employee {
    abstract void calculateSalary();
}

// FullTimeEmployee subclass
class FullTimeEmployee extends Employee {
    private final int fixedSalary;

    // Constructor
    public FullTimeEmployee(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Full-Time Salary: " + fixedSalary);
    }
}

// PartTimeEmployee subclass
class PartTimeEmployee extends Employee {
    private final int hours;
    private final int rate;

    // Constructor
    public PartTimeEmployee(int hours, int rate) {
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public void calculateSalary() {
        int salary = hours * rate;
        System.out.println("Part-Time Salary: " + salary);
    }
}

// Main class
public class EmployeeAbstract {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(50000);
        Employee e2 = new PartTimeEmployee(5, 500);

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
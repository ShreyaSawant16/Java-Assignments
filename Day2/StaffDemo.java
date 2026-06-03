package oopconcepts;
abstract class Staff {
    abstract void calculateSalary();
}

class PermanentEmployee extends Staff {
    void calculateSalary() {
        System.out.println("Permanent Employee Salary = 50000");
    }
}

class TemporaryEmployee extends Staff {
    void calculateSalary() {
        System.out.println("Temporary Employee Salary = 8000");
    }
}

public class StaffDemo {
    public static void main(String[] args) {

        Staff s1 = new PermanentEmployee();
        Staff s2 = new TemporaryEmployee();

        s1.calculateSalary();
        s2.calculateSalary();
    }
}
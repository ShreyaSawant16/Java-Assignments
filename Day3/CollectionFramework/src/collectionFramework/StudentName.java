package collectionFramework;

import java.util.ArrayList;

public class StudentName {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        
        students.add("Shreya");
        students.add("Sayali");
        students.add("tehseen");
        students.add("Tanuja");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }
    }
}
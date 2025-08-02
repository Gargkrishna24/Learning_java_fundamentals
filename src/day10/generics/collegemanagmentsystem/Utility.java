package day10.generics.collegemanagmentsystem;
import day10.generics.collegemanagmentsystem.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Utility {
    public void displayAll(List<? extends  Person> list) {
        if (list.isEmpty()) {
            System.out.println("No records to display.");
            return;
        }
        System.out.println("\n All Records ");
        for (Object person : list) {
            Person person1 = (Person) person;
            person1.displayDetails();
        }
        System.out.println("---------------------\n");
    }
}

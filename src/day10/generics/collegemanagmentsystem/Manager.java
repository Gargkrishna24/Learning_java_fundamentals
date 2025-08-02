package day10.generics.collegemanagmentsystem;

import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Person> {
    public List<T> list;

    public Manager() {
        this.list = new ArrayList<T>();
    }


    public void addPerson(T person) {
        list.add(person);
        System.out.println(person.getName() + " added successfully.");
    }


    public T getPersonById(int id) {
        for (T person : list) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("No records to display.");
            return;
        }
        System.out.println("\n All Records ");
        for (T person : list) {
            person.displayDetails();
        }
        System.out.println("---------------------\n");
    }


    public void updatePerson(int id, T updatedPerson) {
        T existingPerson = getPersonById(id);
        if (existingPerson != null) {
            int index = list.indexOf(existingPerson);
            list.set(index, updatedPerson);
            System.out.println("Record with ID " + id + " updated successfully.");
        } else {
            System.out.println("Record with ID " + id + " not found.");
        }
    }


    public void deletePerson(int id) {
        T personToDelete = getPersonById(id);
        if (personToDelete != null) {
            list.remove(personToDelete);
            System.out.println("Record with ID " + id + " deleted successfully.");
        } else {
            System.out.println("Record with ID " + id + " not found.");
        }
    }
}

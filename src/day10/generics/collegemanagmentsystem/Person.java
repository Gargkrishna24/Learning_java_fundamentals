package day10.generics.collegemanagmentsystem;

public abstract class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

package day10.generics.collegemanagmentsystem;

public class Employee extends Person {
    private String designation;
    private double salary;
    private String branch;

    public Employee(int id, String name, String designation, double salary, String branch) {
        super(id, name);
        this.designation = designation;
        this.salary = salary;
        this.branch = branch;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Employee Details ---");
        System.out.println(super.toString());
        System.out.println("Designation: " + designation + ", Salary: " + salary + ", Branch: " + branch);
    }

}

package day10.generics.collegemanagmentsystem;
public class Main {
    public static void main(String[] args) {
        Manager<Student> studentManager = new Manager<Student>();

        System.out.println(" CRUD operations on Students:");


        studentManager.addPerson(new Student(101, "Alice", "Computer Science", 'A', "U2023001"));
        studentManager.addPerson(new Student(102, "Bob", "Electronics", 'B', "U2023002"));

        studentManager.displayAll();

        Student foundStudent = studentManager.getPersonById(101);
        if (foundStudent != null) {
            foundStudent.displayDetails();
        }

        Student s1_updated = new Student(101, "Alice Smith", "Computer Science", 'B', "U2023001");
        studentManager.updatePerson(101, s1_updated);
        studentManager.displayAll();

        studentManager.deletePerson(102);
        studentManager.displayAll();

        Manager<Employee> employeeManager = new Manager<Employee>();


        employeeManager.addPerson(new Employee(201, "John Doe", "Professor", 95000.00, "CS"));
        employeeManager.addPerson(new Employee(202, "Jane Smith", "Librarian", 45000.00, "Library"));

        employeeManager.displayAll();

        Employee e2_updated = new Employee(202, "Jane Smith", "Chief Librarian", 55000.00, "Library");
        employeeManager.updatePerson(202, e2_updated);
        employeeManager.displayAll();

        employeeManager.deletePerson(201);
        employeeManager.displayAll();

        Utility  utility =new Utility();
        utility.displayAll(employeeManager.list);
    }
}






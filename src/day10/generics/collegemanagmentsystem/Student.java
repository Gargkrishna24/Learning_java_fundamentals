package day10.generics.collegemanagmentsystem;

public class Student extends Person {
    private String stream;
    private char grade;
    private String univRollNo;

    public Student(int id, String name, String stream, char grade, String univRollNo) {
        super(id, name);
        this.stream = stream;
        this.grade = grade;
        this.univRollNo = univRollNo;
    }

    public String getStream() {
        return stream;
    }

    public char getGrade() {
        return grade;
    }

    public String getUnivRollNo() {
        return univRollNo;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println(super.toString());
        System.out.println("Stream: " + stream + ", Grade: " + grade + ", University Roll No: " + univRollNo);
    }
}
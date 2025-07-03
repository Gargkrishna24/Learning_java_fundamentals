package day4.oop.encapsulaton;

public class Student {
    private String name;
    private long rollNumber;
    private int age;

    public void setAge(int age) {
        if (age < 0) System.out.println(Integer.MIN_VALUE);
        else
            this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setRollNumber(long rollNumber) {
        if (rollNumber < 0) System.out.println(Integer.MIN_VALUE);
        else this.rollNumber = rollNumber;
    }

    public long getRollNumber() {
        return this.rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                '}';
    }
}

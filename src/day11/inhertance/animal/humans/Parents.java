package day11.inhertance.animal.humans;

public class Parents extends Grandparents {

    public Parents(String name, int age) {
        super(name, age);
        System.out.println("Parent constructor is created");
    }
}
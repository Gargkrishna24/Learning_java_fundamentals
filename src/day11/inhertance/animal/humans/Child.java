package day11.inhertance.animal.humans;

public class Child extends Parents{
    public Child(String name , int age){
        super(name , age );
        System.out.println("Child Constructor is created");
    }
}

package day13.encapsulation.runtimepolymorphism;

public class Dog extends Animal{
    @Override
    public void speak(){
        System.out.println("Speak");
    }
    public void bye(){
        System.out.println("Woof Woof");
    }
}

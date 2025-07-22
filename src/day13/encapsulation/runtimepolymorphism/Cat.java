package day13.encapsulation.runtimepolymorphism;

public class Cat extends Animal{
    @Override
    public void speak(){
        System.out.println("meow");
    }
    public void bye(){
        System.out.println("Meow Meow");
    }
}

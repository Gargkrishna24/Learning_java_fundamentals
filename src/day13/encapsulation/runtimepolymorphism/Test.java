package day13.encapsulation.runtimepolymorphism;

public class Test {
    public static void main(String[] args) {
     // run time polymorphism
        Animal dog = new Dog();
        dog.setName("krishna garg");
        System.out.println(dog.getName());
        Animal cat = new Cat();
        cat.setAge(34);
        System.out.println(cat.getAge());

    }
}

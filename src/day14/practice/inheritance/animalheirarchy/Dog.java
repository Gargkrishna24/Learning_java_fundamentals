package day14.practice.inheritance.animalheirarchy;

public class Dog extends Animal{
    @Override
    public void makeSound() {

        System.out.println("woof");
    }
    public void sayBye(){
        System.out.println("Woof Woof ");
    }
}

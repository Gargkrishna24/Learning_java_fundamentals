import day11.inhertance.animal.Dog;
import day11.inhertance.animal.humans.Child;
import day11.inhertance.animal.humans.Parents;

class Main{
    public static void main(String[] args) {
        Child child1 = new Child("krishna garg",24);
        System.out.println(child1.isHasSuperPower());
        System.out.println(child1.getName());
        System.out.println(child1.getAge());
        System.out.println(child1.getClass());

    }
}
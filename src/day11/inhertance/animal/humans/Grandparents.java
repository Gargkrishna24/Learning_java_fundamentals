package day11.inhertance.animal.humans;

public class Grandparents {
    private String name ;
    private int age;
    private boolean hasSuperPower;

    public boolean isHasSuperPower() {
        return hasSuperPower;
    }

    public Grandparents(){
         hasSuperPower = true;
         System.out.println("GrandParent constructor has been created");
    }
    public Grandparents(String name , int age){
        this.name = name ;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

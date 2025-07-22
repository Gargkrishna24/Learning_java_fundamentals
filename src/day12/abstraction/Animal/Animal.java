package day12.abstraction.Animal;

public abstract class Animal {
     private int age ;
     private String name;

     protected Animal(){
         this.name = "krishna garg";
         this.age = 24;
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void  voice();

}

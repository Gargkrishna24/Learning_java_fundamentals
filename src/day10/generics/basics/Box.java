package day10.generics.basics;

public class Box {
    private int value;
    private String name ;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.setValue(6);
        System.out.println(box.getValue());
    }
}

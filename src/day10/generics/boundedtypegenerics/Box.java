package day10.generics.boundedtypegenerics;

public class Box<T extends Number> {// it is Bounded type Parameter...
    private T number1 ;
    private T number2 ;

    public T getNumber1() {
        return number1;
    }

    public void setNumber1(T number1) {
        this.number1 = number1;
    }

    public T getNumber2() {
        return number2;
    }

    public void setNumber2(T number2) {
        this.number2 = number2;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setNumber1(6);
        box.setNumber2(8);
        System.out.println(box.getNumber1()+ box.getNumber2());
        Box<Double> box2 = new Box<>();
        box2.setNumber1(6.8);
        box2.setNumber2(8.9);
        System.out.println(box.getNumber1()+ box.getNumber2());

    }
}

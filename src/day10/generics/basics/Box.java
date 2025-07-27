package day10.generics.basics;

public class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(6);
        System.out.println(box.getValue());
    }
}

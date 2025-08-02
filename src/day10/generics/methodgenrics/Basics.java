package day10.generics.methodgenrics;

public class Basics{
    public static void main(String[] args) {
        String message = MyUtilities.printAndReturn("Hello Java Generics!");
        System.out.println("Returned message: " + message);


        Integer number = MyUtilities.printAndReturn(42);
        System.out.println("Returned number: " + number);


        Car myCar = new Car("Toyota");
        Car returnedCar = MyUtilities.printAndReturn(myCar);
        System.out.println("Returned car: " + returnedCar.getModel());

        MyUtilities.printPair("Name", "Alice");
        MyUtilities.printPair(101, true);

    }

}
class MyUtilities {

    public static <T> T printAndReturn(T element) {
        System.out.println("Printing: " + element);
        return element;
    }

    public static <K, V> void printPair(K key, V value) {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

class Car {
    private String model;
    public Car(String model) { this.model = model; }
    public String getModel() { return model; }
    @Override
    public String toString() { return "Car [model=" + model + "]"; }
}

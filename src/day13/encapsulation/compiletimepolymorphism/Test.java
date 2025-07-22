package day13.encapsulation.compiletimepolymorphism;

public class Test {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add (int, int): " + calc.add(10, 20));
        System.out.println("Add (int, int, int): " + calc.add(5, 10, 15));
        System.out.println("Add (double, double): " + calc.add(3.5, 4.5));
        System.out.println("Add (String, String): " + calc.add("Hello ", "Baby"));
    }
}

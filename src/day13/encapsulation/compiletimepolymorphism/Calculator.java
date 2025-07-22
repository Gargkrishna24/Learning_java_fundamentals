package day13.encapsulation.compiletimepolymorphism;

public class Calculator {

    // Addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Addition of two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Concatenation of two strings
    public String add(String a, String b) {
        return a + b;
    }
}


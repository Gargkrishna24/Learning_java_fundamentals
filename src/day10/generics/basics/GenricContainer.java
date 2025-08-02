package day10.generics.basics;

public class GenricContainer implements Container<Integer>{
    @Override
    public void add(Integer number) {
        System.out.println(number +1 );
    }

    @Override
    public void multiply(Integer number) {
        System.out.println(number * 7);
    }

    public static void main(String[] args) {
        GenricContainer genricContainer = new GenricContainer();
        genricContainer.add(7);
        genricContainer.multiply(7);
    }
}

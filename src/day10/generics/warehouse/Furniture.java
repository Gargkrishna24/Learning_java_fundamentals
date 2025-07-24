package day10.generics.warehouse;

public class Furniture extends WareHouse{

    Furniture(String name){
        super(name);
    }
    @Override
    public void getCategory(){
        System.out.println(getName());
    }
}

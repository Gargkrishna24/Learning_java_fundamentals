package day10.generics.warehouse;

public class Electronics extends WareHouse{
    Electronics(String name){
        super(name);
    }



    @Override
    public void getCategory(){
        System.out.println(getName());
    }
}

package day10.generics.warehouse;

public  class Groceries extends WareHouse{
     Groceries(String name){
         super(name);
    }

    @Override
    public void getCategory(){
        System.out.println(getName());
    }

}

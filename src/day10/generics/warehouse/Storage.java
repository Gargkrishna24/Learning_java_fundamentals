package day10.generics.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WareHouse> {
    ArrayList<T> list = new ArrayList<>();
     public void addItems(T items){
         list.add(items);
     }
     public void remove(String items){
         for (int i = 0; i < list.size(); i++) {
             if(list.get(i).getName().equals(items))
             {
                 list.remove(list.get(i));
                 System.out.println("the item "+items+" is removed");
                 return;
             }
         }
         System.out.println("the item "+items+" doesnot exist in our list");
     }
     public void display(List<? extends WareHouse> itemList){
         for (WareHouse wareHouse : itemList) {
             System.out.println("itemListget = " + wareHouse.getName());
         }
     }
}


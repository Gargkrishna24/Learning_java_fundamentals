package day10.generics.warehouse;

public abstract class WareHouse {
    private  String name;

    public WareHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void getCategory();
}

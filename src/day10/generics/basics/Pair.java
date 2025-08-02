package day10.generics.basics;

public class Pair<K,V> {
    private K key ;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>();
        pair.setKey("Age");
        pair.setValue(55);
        System.out.println("Key  : "+pair.getKey());
        System.out.println("value : "+pair.getValue());
    }
}

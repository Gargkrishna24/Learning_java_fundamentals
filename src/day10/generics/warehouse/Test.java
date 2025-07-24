package day10.generics.warehouse;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("enter the choice");
            System.out.println("1. Groceries \n2.Furniture \n3.Electronics \n4.exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    groceries();
                    break;
                case 2 :
                    furniture();
                    break;
                case 3 :
                    electronics();
                    break;
                case 4 :
                    return;
                default:
                    System.out.println("invalid choice");
            }
        }

    }

    private static void groceries() {
        Storage<Groceries> groceriesStorage = new Storage<>();
        Groceries groceries0 = new Groceries("Carrot");
        Groceries groceries2= new Groceries("potato");
        Groceries groceries4 = new Groceries("tomato");
        groceriesStorage.addItems(groceries0);
        groceriesStorage.addItems(groceries2);
        groceriesStorage.addItems(groceries4);

        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.println("enter the choice");
            System.out.println("1. Add Groceries \n2.remove Groceries \n3. Display  \n4. exit");
            int choice = sc.nextInt();
            if(choice==4)
            {
                break;
            }
            switch(choice)
            {
                case 1 :
                    System.out.println("enter the Groceries item name");
                    String item = sc.next();
                    Groceries newGroceries = new Groceries(item);
                    groceriesStorage.addItems(newGroceries);
                    break;
                case 2 :
                    System.out.println("enter the Groceries item name");
                    item = sc.next();
                    groceriesStorage.remove(item);
                    break;
                case 3 :
                    groceriesStorage.display(groceriesStorage.list);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }
        }
    }
    private static void electronics() {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Electronics electronics = new Electronics("Fan");
        Electronics electronics1 = new Electronics("Washing Machine");
        Electronics electronics2 = new Electronics("fridge");
        electronicsStorage.addItems(electronics);
        electronicsStorage.addItems(electronics1);
        electronicsStorage.addItems(electronics2);
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Add \n2. Remove \n3. Display \n4. Exit");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1 :
                    System.out.println("enter the Electronics item name");
                    String item = sc.next();
                    Electronics newElectronics = new Electronics(item);
                    electronicsStorage.addItems(newElectronics);
                    break;
                case 2 :
                    System.out.println("enter the Electronics item name");
                    item = sc.next();
                    electronicsStorage.remove(item);
                    break;
                case 3 :
                    electronicsStorage.display(electronicsStorage.list);
                    break;
                case 4 :
                    System.out.println("invalid choice");
                    break;
            }
        }
    }
    private static void furniture() {
        Storage<Furniture> furnitureStorage = new Storage<>();
        Furniture furniture0 = new Furniture("table");
        Furniture furniture1 = new Furniture("Chair");
        Furniture furniture2 = new Furniture("Bed");
        furnitureStorage.addItems(furniture0);
        furnitureStorage.addItems(furniture1);
        furnitureStorage.addItems(furniture2);
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add \n2. Remove \n3. Display \n4. Exit");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1 :
                furnitureStorage.addItems(furniture0);
                furnitureStorage.addItems(furniture1);
                furnitureStorage.addItems(furniture1);
                break;
            case 2 :
                System.out.println("enter the Furniture item name");
                 String item = sc.next();
                furnitureStorage.remove(item);
                break;
            case 3 :
                furnitureStorage.display(furnitureStorage.list);
                break;
            case 4 :
                System.out.println("invalid choice");
                break;
        }
    }
}

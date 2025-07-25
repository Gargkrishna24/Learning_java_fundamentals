package day10.generics.dynamicmarketplace;

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category; // The specific category for this product

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
        // Optional: Validate price against category's min/max price
        if (price < category.getMinPrice() || price > category.getMaxPrice()) {
            System.out.println("Warning: Price $" + price + " for " + name + " is outside the typical range for " + category.getCategoryName() + " ($" + category.getMinPrice() + " - $" + category.getMaxPrice() + ").");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + String.format("%.2f", price) + ", " + category.toString();
    }
}

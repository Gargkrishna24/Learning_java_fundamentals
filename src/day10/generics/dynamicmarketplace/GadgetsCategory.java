package day10.generics.dynamicmarketplace;

class GadgetCategory implements ProductCategory {
    private final String categoryName = "Gadgets";
    private final double minPrice = 50.00;
    private final double maxPrice = 2000.00;

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public double getMinPrice() {
        return minPrice;
    }

    @Override
    public double getMaxPrice() {
        return maxPrice;
    }

    @Override
    public String toString() {
        return "Category: " + categoryName + " [Price Range: $" + minPrice + " - $" + maxPrice + "]";
    }
}

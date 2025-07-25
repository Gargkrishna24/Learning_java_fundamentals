package day10.generics.dynamicmarketplace;

class ClothingCategory implements ProductCategory {
    private final String categoryName = "Clothing";
    private final double minPrice = 10.00;
    private final double maxPrice = 500.00;

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


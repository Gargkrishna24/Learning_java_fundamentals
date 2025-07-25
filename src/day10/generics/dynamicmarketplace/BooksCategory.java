package day10.generics.dynamicmarketplace;

class BookCategory implements ProductCategory {
    private final String categoryName = "Books";
    private final double minPrice = 5.00;
    private final double maxPrice = 100.00;

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

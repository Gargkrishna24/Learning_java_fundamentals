package day10.generics.dynamicmarketplace;

class DiscountService {
    /**
     * Applies a discount to a given product.
     * This is a generic method with a bounded type parameter, ensuring that
     * only instances of Product (or its subclasses) can be passed.
     *
     * @param <T> The type of the product, which must extend Product.
     * @param product The product to apply the discount to.
     * @param percentage The discount percentage (e.g., 0.10 for 10%).
     */
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        if (percentage < 0 || percentage > 1) {
            System.out.println("Invalid discount percentage. Must be between 0 and 1.");
            return;
        }
        double originalPrice = product.getPrice();
        double discountedPrice = originalPrice * (1 - percentage);
        product.setPrice(discountedPrice);
        System.out.println("Applied " + (percentage * 100) + "% discount to " + product.getName() +
                ". Original Price: $" + String.format("%.2f", originalPrice) +
                ", New Price: $" + String.format("%.2f", discountedPrice));
    }
}
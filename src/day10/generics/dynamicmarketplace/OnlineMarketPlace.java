package day10.generics.dynamicmarketplace;
import java.util.List;

 class OnlineMarketplace {
    public static void main(String[] args) {
        BookCategory bookCat = new BookCategory();
        ClothingCategory clothingCat = new ClothingCategory();
        GadgetCategory gadgetCat = new GadgetCategory();

        Product<BookCategory> book1 = new Product<>("The Great Adventure", 25.50, bookCat);
        Product<BookCategory> book2 = new Product<>("Java Programming Guide", 55.00, bookCat);
        Product<ClothingCategory> shirt = new Product<>("Casual T-Shirt", 30.00, clothingCat);
        Product<ClothingCategory> jeans = new Product<>("Slim Fit Jeans", 85.00, clothingCat);
        Product<GadgetCategory> smartphone = new Product<>("Smartphone X", 799.99, gadgetCat);
        Product<GadgetCategory> laptop = new Product<>("UltraBook Pro", 1200.00, gadgetCat);
        Product<GadgetCategory> smartwatch = new Product<>("SmartWatch Z", 150.00, gadgetCat); // Price warning expected

        // Create a product catalog
        ProductCatalog catalog = new ProductCatalog();

        // Add products to the catalog
        catalog.addProduct(book1);
        catalog.addProduct(book2);
        catalog.addProduct(shirt);
        catalog.addProduct(jeans);
        catalog.addProduct(smartphone);
        catalog.addProduct(laptop);
        catalog.addProduct(smartwatch);

        // Display the initial catalog
        catalog.displayCatalog();

        // Apply discounts using the generic method
        System.out.println("\n--- Applying Discounts ---");
        DiscountService.applyDiscount(book1, 0.15); // 15% off book1
        DiscountService.applyDiscount(smartphone, 0.05); // 5% off smartphone
        DiscountService.applyDiscount(jeans, 0.20); // 20% off jeans

        // Display catalog after discounts
        catalog.displayCatalog();

        // Demonstrate finding products by category
        System.out.println("\n--- Searching Products by Category ---");
        List<Product<? extends ProductCategory>> books = catalog.findProductsByCategory("Books");
        System.out.println("Books in catalog:");
        books.forEach(System.out::println);

        List<Product<? extends ProductCategory>> electronics = catalog.findProductsByCategory("Gadgets");
        System.out.println("\nGadgets in catalog:");
        electronics.forEach(System.out::println);

        List<Product<? extends ProductCategory>> nonExistent = catalog.findProductsByCategory("Electronics");
        System.out.println("\nElectronics in catalog (should be empty):");
        if (nonExistent.isEmpty()) {
            System.out.println("No products found in 'Electronics' category.");
        } else {
            nonExistent.forEach(System.out::println);
        }
    }
}
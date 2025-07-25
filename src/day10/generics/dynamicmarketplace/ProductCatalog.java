package day10.generics.dynamicmarketplace;
import java.util.ArrayList;
import java.util.List;

class ProductCatalog {
    private List<Product<? extends ProductCategory>> products; // Using wildcard for flexibility

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the catalog.
     * @param product The product to add.
     */
    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
        System.out.println("Added to catalog: " + product.getName());
    }

    /**
     * Displays all products in the catalog.
     */
    public void displayCatalog() {
        System.out.println("\n--- Product Catalog ---");
        if (products.isEmpty()) {
            System.out.println("Catalog is empty.");
            return;
        }
        for (Product<? extends ProductCategory> product : products) {
            System.out.println(product);
        }
        System.out.println("-----------------------");
    }

    /**
     * Finds products by category name.
     * @param categoryName The name of the category to search for.
     * @return A list of products belonging to the specified category.
     */
    public List<Product<? extends ProductCategory>> findProductsByCategory(String categoryName) {
        List<Product<? extends ProductCategory>> foundProducts = new ArrayList<>();
        for (Product<? extends ProductCategory> product : products) {
            if (product.getCategory().getCategoryName().equalsIgnoreCase(categoryName)) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }
}



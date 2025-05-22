public class ProductFilter {

    public void filterProducts(String category) {
        System.out.println("Showing products in category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Showing products priced between $" + minPrice + " and $" + maxPrice);
    }

    public void filterProductsByBrand(String brand) {
        System.out.println("Showing products from brand: " + brand);
    }

    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Showing " + category + " products priced between $" + minPrice + " and $" + maxPrice);
    }

    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Showing " + brand + " products in " + category + " category priced between $" + minPrice + " and $" + maxPrice);
    }

    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();

        filter.filterProducts("electronics");
        filter.filterProducts(100, 500);
        filter.filterProductsByBrand("Apple");
        filter.filterProducts("fashion", 50, 200);
        filter.filterProducts("electronics", 300, 1000, "Samsung");
    }
}

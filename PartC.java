import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - " + category;
    }
}

public class PartC {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200, "Electronics"),
            new Product("Mouse", 25, "Electronics"),
            new Product("Desk", 200, "Furniture"),
            new Product("Chair", 100, "Furniture"),
            new Product("Pen", 2, "Stationery"),
            new Product("Notebook", 5, "Stationery")
        );

        // Group products by category
        Map<String, List<Product>> grouped = products.stream()
            .collect(Collectors.groupingBy(p -> p.category));

        System.out.println("Products grouped by category:");
        grouped.forEach((cat, list) -> System.out.println(cat + ": " + list));

        // Find most expensive product in each category
        Map<String, Optional<Product>> maxProduct = products.stream()
            .collect(Collectors.groupingBy(
                p -> p.category,
                Collectors.maxBy(Comparator.comparingDouble(p -> p.price))
            ));

        System.out.println("\nMost expensive product in each category:");
        maxProduct.forEach((cat, prod) -> System.out.println(cat + ": " + prod.get()));

        // Calculate average price of all products
        double avgPrice = products.stream()
            .collect(Collectors.averagingDouble(p -> p.price));
        System.out.println("\nAverage price of all products: $" + avgPrice);
    }
}

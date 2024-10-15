import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
    public class InventoryManager {
        private List<Product> products;

        public InventoryManager() {
            this.products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product) {
            products.remove(product);
        }

        public double calculateTotalInventoryValue() {
            return products.stream().mapToDouble(p -> p.getBasePrice() * p.getStockLevel()).sum();
        }

        public double calculateInventoryValueByCategory(String category) {
            return products.stream()
                    .filter(p -> p.getCategory().equals(category))
                    .mapToDouble(p -> p.getBasePrice() * p.getStockLevel())
                    .sum();
        }

    }



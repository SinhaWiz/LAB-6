import java.util.ArrayList;
import java.util.List;
public class Order {
    private List<Product> products;
    private String status;

    public Order() {
        this.products = new ArrayList<>();
        this.status = "pending";
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public void processOrder(InventoryManager inventoryManager) {
        for (Product product : products) {
            product.setStockLevel(product.getStockLevel() - 1);
        }
        this.status = "shipped";
    }

    public void generateInvoice() {

        System.out.println("Invoice generated for order.");
    }

    public String getStatus() {
        return status;
    }
}

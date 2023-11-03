package ian.Structural.Adapter.level2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryAdapter implements Vendor {
    private Inventory inventory;

    public InventoryAdapter(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public Map<String, Integer> checkStock() {
        List<Product> products = inventory.getAvailableProducts();
        HashMap<String, Integer> productList = new HashMap<>();
        products.stream()
                .forEach(p -> {
                    productList.put(p.getName(), p.getQuantity());
                });
        return productList;
    }
}

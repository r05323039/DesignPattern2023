package ian.Structural.Adapter.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VendorAdapter implements Inventory {
    private Vendor vendor;

    public VendorAdapter(Vendor vendor) {
        this.vendor = vendor;
    }

    public List<Product> getAvailableProducts() {
        Map<String, Integer> productList = vendor.checkStock();
        ArrayList<Product> products = new ArrayList<>();
        productList.forEach((k, v) -> {
            products.add(new Product(k, v));
        });
        return products;
    }
}

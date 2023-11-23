package ian.Behavioral.Visitor.level2;

import java.util.ArrayList;
import java.util.List;

class Client {
    public static void main(String[] args) {
        List<Commodity> items = new ArrayList<>();
        items.add(new Book(50, "1234"));
        items.add(new Electronics(1000, "Sony"));

        DiscountVisitor discountVisitor = new DiscountVisitorImpl();
        for (Commodity item : items) {
            item.accept(discountVisitor);
        }
    }
}

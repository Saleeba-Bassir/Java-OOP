import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 4.00);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("cappuccino", 3.75);

        // Create orders
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Add items to orders
        order1.addItem(item3);
        order2.addItem(item1);
        order2.addItem(item1);
        order3.addItem(item4);
        order4.addItem(item2);

        // Update order information
        order2.setStatus("ready");
        order3.setStatus("ready");
        order4.addItem(item2);
        order4.addItem(item2);
        order1.setStatus("ready");

        // Print order information
        System.out.printf("Order 1:\nName: %s\nTotal: %s\nStatus: %s\n", order1.getName(), order1.getTotal(), order1.getStatus());
        System.out.printf("Order 2:\nName: %s\nTotal: %s\nStatus: %s\n", order2.getName(), order2.getTotal(), order2.getStatus());
        System.out.printf("Order 3:\nName: %s\nTotal: %s\nStatus: %s\n", order3.getName(), order3.getTotal(), order3.getStatus());
        System.out.printf("Order 4:\nName: %s\nTotal: %s\nStatus: %s\n", order4.getName(), order4.getTotal(), order4.getStatus());
}
}
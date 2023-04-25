public class OrderItemTest {

    public static void main(String[] args) {
        
        Order order1 = new Order();
        Order order2 = new Order();
        
        Order order3 = new Order("John");
        Order order4 = new Order("Jane");
        Order order5 = new Order("Bob");
        
        Item item1 = new Item("Coffee", 2.99);
        Item item2 = new Item("Bagel", 1.99);
        Item item3 = new Item("Muffin", 1.49);
        Item item4 = new Item("Donut", 0.99);
        Item item5 = new Item("Juice", 3.49);
        
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item2);
        order2.addItem(item3);
        order3.addItem(item1);
        order3.addItem(item3);
        order3.addItem(item5);
        order4.addItem(item2);
        order4.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item2);
        order5.addItem(item3);
        order5.addItem(item4);

        order2.setReady(true);
        order5.setReady(true);

        System.out.println(order1.getStatusMessage()); 
        System.out.println(order2.getStatusMessage()); 
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
    }
}

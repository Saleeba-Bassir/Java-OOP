import java.util.ArrayList;

class Order {
    private String name;
    private double total;
    private String status;
    private ArrayList<Item> items;

    public Order(String name) {
        this.name = name;
        this.total = 0.0;
        this.status = "Pending";
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    public String getName() {
        return this.name;
    }

    public double getTotal() {
        return this.total;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

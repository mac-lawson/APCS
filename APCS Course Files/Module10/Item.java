/*
 * Name: Mac Lawson
 * 4/12/23
 * Item implementation class
 */
public class Item {
    private String name;
    private int productNumber;
    private double price;
    private int quantity;

    public Item(String name, int productNumber, double price, int quantity) {
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%-20s %-10d $%.2f %10d", name, productNumber, price, quantity);
    }
}


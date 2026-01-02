package J05047;

public class Product implements Comparable<Product> {
    private String id, name;
    long quantity, price;

    public Product(String id, String name, long quantity, long price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getDiscount() {
        long tong = this.quantity * this.price;
        if(this.quantity > 10) return tong * 5 / 100;
        else if(this.quantity >= 8) return tong * 2 / 100;
        else if(this.quantity >= 5) return tong * 1 / 100;
        else return 0;
    }

    @Override
    public int compareTo(Product other) {
        if(this.getDiscount() > other.getDiscount()) return -1;
        else return 1;
    }
    public String toString() {
        return this.id + " " + this.name + " " + this.getDiscount() + " " + (this.price * this.quantity - this.getDiscount());
    }
}

package J05012;

public class Product implements Comparable<Product> {
    private String id, name;
    long quantity, price, discount;

    public Product(String id, String name, long quantity, long price, long discount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public long chiPhi() {
        return this.quantity * this.price - this.discount;
    }
    @Override
    public int compareTo(Product other) {
        long thisChiPhi = this.chiPhi();
        long otherChiPhi = other.chiPhi();
        if(thisChiPhi > otherChiPhi) return -1;
        else return 1;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.quantity + " " + this.price + " " + this.discount + " " + this.chiPhi();
    }
}

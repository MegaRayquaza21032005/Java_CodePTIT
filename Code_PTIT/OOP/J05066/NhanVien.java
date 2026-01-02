package J05066;

public class NhanVien implements Comparable<NhanVien>{
    private String id, name;

    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(NhanVien other) {
        String thisHS = this.id.substring(2, 4);
        String otherHS = other.id.substring(2, 4);
        String thisID = this.id.substring(4);
        String otherID = other.id.substring(4);
        if(otherHS.compareTo(thisHS) != 0) return otherHS.compareTo(thisHS);
        else return thisID.compareTo(otherID);
    }

    @Override
    public String toString() {
        return this.name + " " + this.id.substring(0, 2) + " " + this.id.substring(4) + " " + this.id.substring(2, 4);
    }
}

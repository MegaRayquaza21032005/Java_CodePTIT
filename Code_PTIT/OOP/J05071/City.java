package J05071;

public class City {
    private String id, name;
    private long cuoc;

    public City(String id, String name, long cuoc) {
        this.id = id;
        this.name = name;
        this.cuoc = cuoc;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getCuoc() {
        return cuoc;
    }
}

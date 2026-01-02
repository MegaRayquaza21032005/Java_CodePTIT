package J07038;

public class Company {
    private String id, name;
    private int number;

    public Company(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

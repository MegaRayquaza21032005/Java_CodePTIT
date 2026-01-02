package J05080;

public class Group implements Comparable<Group>{
    private String id, subject, group, name;

    public Group(String id, String subject, String group, String name) {
        this.id = id;
        this.subject = subject;
        this.group = group;
        this.name = name;
    }

    public String getName() {return this.name;}

    @Override
    public int compareTo(Group other) {
        if(this.id.compareTo(other.id) != 0) return this.id.compareTo(other.id);
        return this.group.compareTo(other.group);
    }
    public String toString() {
        return this.id + " " + this.subject + " " + this.group;
    }
}

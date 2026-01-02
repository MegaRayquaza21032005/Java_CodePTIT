package J05079;

public class Group implements Comparable<Group>{
    private String id, subject, group, name;

    public Group(String id, String subject, String group, String name) {
        this.id = id;
        this.subject = subject;
        this.group = group;
        this.name = name;
    }

    public String getId() {return this.id;}

    @Override
    public int compareTo(Group other) {
        return this.group.compareTo(other.group);
    }
    public String toString() {
        return this.group + " " + this.name;
    }
}

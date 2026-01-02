package J05032;

import java.time.LocalDate;
public class Person implements Comparable<Person>{
    private String name;
    private LocalDate date;

    public Person(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {return this.name;}
    @Override
    public int compareTo(Person other) {
        if(this.date.isBefore(other.date)) return -1;
        else return 1;
    }
}

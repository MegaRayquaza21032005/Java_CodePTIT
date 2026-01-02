import java.util.*;

/*
Kế thừa - Inheritance
    public class con extends class cha {

    }

 */
public class Main {
    public static void main(String[] args) {
        Student x = new Student("CNTT1", 3.8, "Nhi", "26/09");
        System.out.println(x);

        x.greet();

        Person y = new Person();
        y.greet();
    }
}
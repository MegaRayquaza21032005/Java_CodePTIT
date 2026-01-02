public class Person {
    private String name, birth;
    //protected String name, birth; --> có thể truy cập ở lớp con nhưng vẫn không thể truy cập ở bên ngoài

    Person() {}
    public Person(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String toString() {
        return this.name + " " + this.birth;
    }

    public void greet() {
        System.out.println("Hàm greet của lớp cha!");
    }
}

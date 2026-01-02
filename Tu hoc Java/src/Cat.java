public class Cat extends Animal1 implements Comparable<Cat>{
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }

//    @Override
//    public void eat() {
//        System.out.println("Cat eat");
//    }
}

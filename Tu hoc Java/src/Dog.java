public class Dog implements Animal, Pet{
    @Override
    public void sound() {
        System.out.println("Bark");
    }
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void play() {
        System.out.println("Dog play");
    }
}

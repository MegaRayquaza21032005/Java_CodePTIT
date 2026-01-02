import java.util.Scanner;

public class Main{
    public static void xinchao() {
        System.out.println("Hello World");
    }
    public static int sum(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        xinchao();
        int a = 10, b = 20;
        System.out.println(sum(a, b));
        System.out.println(Math.max(a, b));
    }
}
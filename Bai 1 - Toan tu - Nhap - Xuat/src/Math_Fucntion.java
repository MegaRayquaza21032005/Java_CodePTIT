import java.util.Scanner;

public class Math_Fucntion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Math.abs(a));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 2));
        System.out.println(Math.ceil(Math.PI));
        System.out.println(Math.floor(Math.PI));
    }
}


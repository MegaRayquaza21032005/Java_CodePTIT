public class WHILE {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        while(i <= n)
        {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        int T = 5;
        while(T >= 0) { // không được dùng while(T--)
            System.out.println("T = " + T);
            T -= 1;
        }
        T = 10;
        while(T-- > 0)
        {
            // code
        }
    }
}

public class FOR_long_nhau {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; ++i)
        {
            for(int j = 1; j <= 5; ++j)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        outer : for(int i = 1; i <= 5; ++i)
        {
            for(int j = 1; j <= 5; ++j)
            {
                System.out.print(j + " ");
                if(j == 4) break outer; // kết thúc vòng lặp có label là outer (tên gì cũng đuợc)
            }
        }
    }
}

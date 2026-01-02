import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i)
        {
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(arr); mặc định sắp xếp toàn bộ arrays
        Arrays.sort(arr,0, 3); // sắp xê từ chỉ số 0 -> 2
        for(int i = 0; i < n; ++i)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
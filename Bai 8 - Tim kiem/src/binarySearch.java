import java.util.Arrays;



public class binarySearch {
    public static void main(String[] args) {
        Integer[] arr = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 6, 7, 7, 8, 9, 9, 9, 9, 10, 10};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 6, 15, 3));
    }
}

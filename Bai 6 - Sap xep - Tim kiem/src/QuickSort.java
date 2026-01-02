import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l - 1;

        for (int j = l; j < r; ++j) {
            if (a[j] <= pivot) {
                ++i;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        ++i;
        // Swap a[i] and a[r]
        int temp = a[i];
        a[i] = a[r];
        a[r] = temp;

        return i;
    }

    public static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int p = partition(a, l, r);
            quickSort(a, l, p - 1);
            quickSort(a, p + 1, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        quickSort(a, 0, n - 1);

        for (int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
    }
}

import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] a, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        for (int i = 0; i < left.length; i++)
            left[i] = a[l + i];
        for (int i = 0; i < right.length; i++)
            right[i] = a[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }

    public static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        mergeSort(a, 0, n - 1);

        for (int i = 0; i < n; ++i) {
            System.out.print(a[i] + " ");
        }
    }
}

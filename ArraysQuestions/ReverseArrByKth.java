import java.util.Scanner;

public class ReverseArrByKth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        reverseByKth(arr, k);
        sc.close();

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverseByKth(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int n = arr.length;
        k = ((k % n) + n) % n; // normalize negative values too
        if (k == 0) {
            return;
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

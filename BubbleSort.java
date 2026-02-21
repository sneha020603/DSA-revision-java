import java.util.*;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        int n = arr.length;
        int temp;
        boolean swap;

        for (int i = 0; i < n - 1; i++) {
            swap = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap)
                break;
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before sorting:");
        printArray(arr);

        int[] ans = bubbleSort(arr);
        System.out.println("Array after sorting:");
        printArray(ans);

        sc.close();
    }

}

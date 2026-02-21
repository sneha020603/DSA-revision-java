import java.util.Scanner;

public class InsertionSort {

    public static int[] insertionSort(int[] arr, int n) {

        int key = 0;

        for (int i = 1; i < n; i++) {

            key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before Sorting: ");
        printArray(arr);

        int[] ans = insertionSort(arr, n);
        System.out.println();
        System.out.println("Array after Sorting: ");
        printArray(ans);

        sc.close();
    }

}

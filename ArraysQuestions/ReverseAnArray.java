import java.util.*;

// Reverse an array in place without using an additional array.
// For example, given the array [1, 2, 3, 4, 5], the output should be [5, 4, 3, 2, 1].

public class ReverseAnArray {

    // Approach: Two Pointer Technique
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int[] reverse(int arr[], int n) {

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println();
        System.out.println("Enter the elemnt: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array:");
        int[] ans = reverse(arr, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }

        sc.close();

    }
}

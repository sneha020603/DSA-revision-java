import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxSum(arr);
        sc.close();
    }

    private static void maxSum(int[] arr) {

        if (arr.length == 0) {
            System.out.println(0);
            return;
        }

        int maxCurr = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i : arr) {
            maxCurr = Math.max(maxCurr + i, i);
            maxSum = Math.max(maxCurr, maxSum);

            if (maxCurr < 0) {
                maxCurr = 0;
            }
        }

        System.out.println(maxSum);
    }
}

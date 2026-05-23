import java.util.Scanner;
import java.util.HashSet;

public class IntersectionOf2Arrayys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        intersection(arr1, arr2);
        sc.close();
    }

    private static void intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        
        for (int i : arr2) {
            if (set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

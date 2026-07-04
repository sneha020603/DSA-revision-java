import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int index = binarySearch(arr,x);

        if(index != -1){
            System.out.println("found "+x+" at index(in sorted arr) : "+index);
        }else{
            System.out.println(x+" not found!");
        }

        sc.close();
    }

    private static int binarySearch(int[] arr, int x) {
        Arrays.sort(arr);
        int l =0;
        int r = arr.length - 1;
        int mid;

        while(l <= r){
            mid = l + (r - l) / 2;

            if(arr[mid] == x) return mid;
            if(arr[mid] > x) r = mid - 1;
            else l = mid +1;
        }

        return -1;
    }
}

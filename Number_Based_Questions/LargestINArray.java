import java.util.*;

// Largest number in an array is the maximum element present in the array.
// For example, in the array [3, 5, 7, 2, 8], the largest number is 8.

public class LargestINArray {

    public static int largestNo(int[] arr,int n){
        int max = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans = largestNo(arr,n);
        System.out.println("Largest Number:"+ans);

        sc.close();
    }
    
}

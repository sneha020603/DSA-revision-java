import java.util.Scanner;

// The second largest number in an array is the second maximum element present in the array.
// For example, in the array [3, 5, 7, 2, 8], the second largest number is 7.

public class Largest2NDInArray {

    public static int largestNo2nd(int[] arr,int n){
        int max1st = Integer.MIN_VALUE;
        int max2nd =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max1st){
                max2nd = max1st;
                max1st = arr[i];
            }
            else if(arr[i] >max2nd && arr[i] != max1st){
                max2nd =arr[i];
            }
        }

        return max2nd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the element of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans = largestNo2nd(arr,n);
        System.out.println("2nd Largest Number:"+ans);

        sc.close();
    }
}

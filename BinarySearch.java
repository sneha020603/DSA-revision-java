import java.util.*;

public class BinarySearch {

    // method-1 Iterative Binary Search
    public static int binarySearch1(int[] arr, int t){
        int left = 0, right = arr.length - 1;
        int count = 0;

        while(left <= right){
            count++;
            int mid = left + (right - left) / 2;

            if(arr[mid] == t){
                System.out.println("Iterative Rounds: " + count);
                return mid;
            }

            if(arr[mid] < t)
                left = mid + 1;
            else
                right = mid - 1;
        }

        System.out.println("Iterative Rounds: " + count);
        return -1;
    }


    //method-2  Recursive Binary Search
    public static int binarySearch2(int[] arr, int t , int left, int right, int count){

        if(left > right){
            System.out.println("Recursive Rounds: " + count);
            return -1;
        }

        count++;
        int mid = left + (right - left)/2;

        if(arr[mid] == t){
            System.out.println("Recursive Rounds: " + count);
            return mid;
        }

        if(arr[mid] < t)
            return binarySearch2(arr, t, mid + 1, right, count);
        else
            return binarySearch2(arr, t, left, mid - 1, count);
    }


    public static void main(String[] args) {

        int[] arr = {23,45,2,1,3,0,4,5,23,4,678,32};
        int target = 5;

        // Sort once here
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Iterative
        int result1 = binarySearch1(arr, target);
        if(result1 != -1)
            System.out.println("Iterative: Target found at index: " + result1);
        else
            System.out.println("Iterative: Target not found");

        System.out.println();

        // Recursive
        int result2 = binarySearch2(arr, target, 0, arr.length - 1, 0);
        if(result2 != -1)
            System.out.println("Recursive: Target found at index: " + result2);
        else
            System.out.println("Recursive: Target not found");
    }
}

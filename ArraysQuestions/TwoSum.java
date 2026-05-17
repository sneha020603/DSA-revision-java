import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        getNumbers(arr,target);
        sc.close();
    }

    private static void getNumbers(int[] arr, int target) {
        Arrays.sort(arr);
        int left =0;
        int right = arr.length-1;
        boolean found = false;  

        if(arr == null || arr.length<2) return;

        while(left < right){
            int sum = arr[right] + arr[left];

            if(sum == target){
                System.out.println(arr[left] +" "+arr[right]);
                found = true;
                break;
            }else if(sum > target){
                right--;
            }else{
                left++;
            }
        }
        if(!found){
            System.out.println("No such pair exists");
        }
    }
}

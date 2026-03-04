import java.util.*;

public class ReverseAnArray {

    public static int[ ] reverse(int arr[], int n){

        int left=0;
        int right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println();
        System.out.println("Enter the elemnt: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Reverse array:");
        int[] ans = reverse(arr, n);
        for(int i:ans){
            System.out.print(i+" ");
        }

        sc.close();
        
    }
}

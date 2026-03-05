import java.util.*;

public class RemoveDuplicateFromArray {

    private static int removeDuplicateForSortedArray(int[] arr, int n) {

        if( n == 0) return 0;

        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j] != arr[i]) {
                i++;
                arr[i]=arr[j];
            }
        }

        return i+1;
    }

    private static HashSet<Integer> removeDuplicateForUnsortedArray(int[] arr, int n) {
       
       HashSet<Integer> set = new HashSet<>();
       for(int i:arr){
          set.add(i);
       }

        return set;
    }

    public static void display(int[] arr, int n){
        System.out.println("Array without Duplicates: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");

        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int newLen = removeDuplicateForSortedArray(arr,n);
        display(arr, newLen);

        System.out.println();
        HashSet<Integer> set = removeDuplicateForUnsortedArray(arr,n);
        System.out.println(set);

        sc.close();

    }

}

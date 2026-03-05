import java.util.Scanner;

// Move all zeros to the end of the array while maintaining the relative order of the non-zero elements.
// For example, given the array [0, 1, 0, 3, 12], the output should be [1, 3, 12, 0, 0].    
// The non-zero elements (1, 3, 12) maintain their original order, while the zeros are moved to the end.

public class MoveZerosAtEndOfArray {

    // Approach: Two Pointer Technique
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int[] moveZeros(int[] arr, int n) {
        
        int index = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;

                index++;
            }
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

        System.out.println("array witn zeros at last:");
        int[] ans = moveZeros(arr, n);
        for(int i:ans){
            System.out.print(i+" ");
        }

        sc.close();
    }

}

import java.util.*;

public class SelectionSort {

    public static int[] selectionSort(int[] arr, int n){
        
        int temp =0, minIndex =0;

        for(int i=0; i<n-1;i++)
        {
            minIndex=i;
            for(int j=i+1 ; j<n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before Sorting: ");
        printArray(arr);

        int[] ans = selectionSort(arr,n);
        System.out.println();
        System.out.println("Array after Sorting: ");
        printArray(ans);

        sc.close();

    }
    
}

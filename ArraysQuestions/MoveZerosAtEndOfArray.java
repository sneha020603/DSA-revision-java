import java.util.Scanner;

public class MoveZerosAtEndOfArray {

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

import java.util.Scanner;

public class MovesZerosAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZerosToEnd(arr);
        sc.close();
    }

    private static void moveZerosToEnd(int[] arr) {
        int index =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

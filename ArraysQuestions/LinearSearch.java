import java.util.Scanner;

public class LinearSearch {

    public static void linearSearch(int[] arr, int x){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }

        if(index != -1){
            System.out.println("founded "+x+" at index : "+index);
        }else{
            System.out.println(x+" not found!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        linearSearch(arr,x);
        sc.close();
    }
}

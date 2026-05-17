import java.util.*;

public class FindMaxNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int num:arr){
            if(num > max){
                max = num;
            }
        }

        System.out.println("Max number in array: "+max);

        sc.close();

        int min = Integer.MAX_VALUE;
        for(int num:arr){
            if(num < min){
                min = num;
            }
        }

        System.out.println("Min number in array: "+min);

        sc.close();
    }
}

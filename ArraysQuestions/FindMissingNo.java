import java.util.Scanner;

public class FindMissingNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int exp = n*(n+1)/2;
        int act = 0;

        for(int num:arr){
            act += num;
        }

        System.out.println(exp - act);

        sc.close();
  }  
}

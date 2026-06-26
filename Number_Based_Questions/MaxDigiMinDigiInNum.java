import java.util.Scanner;

public class MaxDigiMinDigiInNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n=num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int rem =0;

        while(n>0){
            rem = n%10;
            max = Math.max(max,rem);
            min = Math.min(min, rem);
            n /=10;
        }
        System.out.println("largest digit: "+max);
        System.out.println("smallest digit: "+min);

        sc.close();
    }
}

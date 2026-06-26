import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int n=num;
        int sum =0, rem=0;
        while(n>0){
            rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        System.out.println("digit sum: "+sum);
        sc.close();
    }
}

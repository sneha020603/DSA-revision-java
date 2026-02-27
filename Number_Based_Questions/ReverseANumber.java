
public class ReverseANumber {

    public static int reverse(int n){
        int temp =n;
        int rev= 0,rem = 0;

        while(temp>0){
            rem = temp%10;
            rev = rev*10 +rem;
            temp /= 10;
        }

        
        return rev;
    }
    public static void main(String[] args) {
        int num =237;
        int ans=reverse(num);
        System.out.println("Reverse :"+ans);
    }
}

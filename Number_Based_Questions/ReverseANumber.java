
public class ReverseANumber {

    // To reverse a number, we can repeatedly extract the last digit of the number and build the reversed number by appending these digits in reverse order.
    // For example, if we have the number 237, we can reverse it as follows
    
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

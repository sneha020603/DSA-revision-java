public class PalindromeNumber {

    // A palindrome number is a number that remains the same when its digits are reversed. 
    // For example, 121 is a palindrome number because it reads the same backward as forward
    
    public static boolean isPalindrome(int num){
        int temp1 =num;
        int rev =0, rem;

        while(temp1>0){
            rem = temp1%10;
            rev = rev*10+rem;
            temp1 /=10;
        }

        if(rev == num) return true;
        
        return false;
    }

    public static void main(String[] args) {
        int num =1001;
        boolean ans = isPalindrome(num);
        System.out.println("isPalinedrome: "+ans);
        
    }
    
}

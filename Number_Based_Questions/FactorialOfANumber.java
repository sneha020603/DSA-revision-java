// Factorial of a number is the product of all positive integers less than or equal to that number.
// For example, the factorial of 5 is 5*4*3*2*1 = 120.

public class FactorialOfANumber {

    public static int recursion(int n){
        if(n==0 || n==1) return 1;
        
        return n*recursion(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        long fact =1;

        for(int i=1;i<=n;i++){
            fact *=i;
        }

        System.out.println("factorial by for loop: "+fact);

        int ans = recursion(n);
        System.out.println("factorial by recursion:"+ans);
    }
    
}


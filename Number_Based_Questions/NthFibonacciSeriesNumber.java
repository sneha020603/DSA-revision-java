public class NthFibonacciSeriesNumber {

// Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
// For example, the first 10 numbers in the Fibonacci series are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.

    public static int recersion(int n){
        if(n==1 || n==0) return 1;
        return n*recersion(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        int fact =1;

        for(int i=1;i<=n;i++){
            fact *=i;
        }

        System.out.println("by For loop:"+fact);

        int ans = recersion(10);
        System.out.println("by For loop:"+ans);

        
    }
    
}

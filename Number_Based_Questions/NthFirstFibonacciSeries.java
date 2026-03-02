public class NthFirstFibonacciSeries {

    public static void main(String[] args) {

        // The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. 
        // For example, the first 10 numbers in the Fibonacci series are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
        
        int n=7;
        int a=0, b=1;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
        
    }
    
}

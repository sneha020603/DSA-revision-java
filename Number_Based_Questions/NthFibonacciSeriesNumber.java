public class NthFibonacciSeriesNumber {

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

public class CheckPrimeNumber {

    // A prime number is a natural number greater than 1 that cannot be formed by multiplying two smaller natural numbers. 
    // For example, 2, 3, 5, 7, 11

    public static boolean isPrime(int num){
    
        if(num <=1) return false;
        if(num == 2) {return true;}
        else{
            for(int i=3;i*i<=num;i+=2){
                if(num % i == 0) return false;
               
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        int num =97;
        boolean ans = isPrime(num);
        System.out.println("Is number Prime: "+ans);
        
    }
    
}

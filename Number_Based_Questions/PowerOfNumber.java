public class PowerOfNumber {

    // Power of a number is the result of multiplying the base number by itself a certain number of times, as indicated by the exponent.
    // For example, 2 raised to the power of 5 (2^5)
    // is calculated as 2 * 2 * 2 * 2 * 2 = 32.
    
    public static void main(String[] args) {
        int base =2;
        int exp =5;
        int ans =1;

        for(int i=1;i<=exp;i++){
            ans *=base;
        }

        System.out.println("Power of number:"+ans);
    }
}

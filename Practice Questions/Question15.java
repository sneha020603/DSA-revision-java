/*
Digital Root (Repeated Sum of Digits until One Digit)  

* Input : 195 
* Output : 6
*/

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        long num = input;
        long rem;
        int sum=0;

        while (num > 9) {
            sum = 0; // Reset sum for each iterations   
        while(num > 0){
            rem = num % 10;
            sum += rem;
            num = num/10;
        }

        num = sum; // Update num to the sum of digits for the next iteration
        }

        System.out.println(sum);
         sc.close();
    }

}

/*
Write a java code to count the number of even digits in a number  

input:482357926 
output : 5
*/

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();

        long num = input;
        long rem;
        int count=0;

        while(num > 0){
            rem = num % 10;
            if(rem % 2 == 0) count++;
            num = num/10;
        }

        System.out.println(count);
         sc.close();
    }
}

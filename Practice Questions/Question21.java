/*
Find the Number of even digits in a number. 
If it is greater than 2 then print true otherwise false  

Input: 14236  
Output: TRUE  

Input: 1459  
Output: FALSE
*/

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count=0;
        int digi;
        while(num > 0){
            digi = num % 10;

            if(digi % 2 == 0){
                count++;
            }

            num = num/10;
        }

        if(count > 2){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

        sc.close();
    }
}

/*
6 * Output : 4  write a java code In the main method read five values for an integer array 
and another two Value which are the limits (Limit 1 Limit2), 
the method should print the average of integer values
 which are greater than 2 and less than 6 
 
 For example if the 
 values are 1,2,3,4,5 and 
 the limits 2 and 6 then 
 the average is 4(3-4-5).  
 
 Input 1 2 3 4 5 
 output 4
*/

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
       
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        
        int sum=0;
        int count = 0;
        int avg;

        for(int i : numbers){
            if( i > limit1 && i < limit2){
                sum += i;
                count++;
            }
        }

        if(count == 0){
            System.out.println(0);
        }else{
            avg = sum /count;
            System.out.println(avg);
        }

        sc.close();

    }
}

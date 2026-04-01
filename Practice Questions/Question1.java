/*
Write main method in Solution class.  
In the main method, read five values for an integer array and two int value which are the limits (limit1 and limit2). 
The main method should print the average of integer values which are greater than limit1 and less than limit2.
For example if the values are 1,2,3,4,5 and the limits are 2 and 6 then the average is 4((3+4+5)/3). 

The output should be in the format of sample output. 

Note : The returned average value should be of int data type.  
Sample input1:  1  2  3  4  5  2  6  
Output: 4
*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int limit1 = scanner.nextInt();
        int limit2 = scanner.nextInt();
        
        int sum = 0;
        int count = 0;
        
        for (int num : numbers) {
            if (num > limit1 && num < limit2) {
                sum += num;
                count++;
            }
        }
        
        int average = (count > 0) ? (sum / count) : 0;
        System.out.println(average);
        
        scanner.close();
    }
}

/*
In the main method, read an integer (containing only numeric digits without decimal and special characters) 
and check whether the sum of its digits is in multiple of 3. 
If the given input is in multiple of 3, 
then print TRUE(as a String) else print FALSE(as a String). 
For example if the given value is 333, 3+3+3 is 9, which is multiple of 3, 
hence TRUE has to be printed  

Sample input1: 333  
Output: TRUE  

Sample input2: 
Input: 200 
 Output: FALSE
*/
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        if (sum % 3 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
        scanner.close();
    }
}

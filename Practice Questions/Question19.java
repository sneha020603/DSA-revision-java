/*
Find the characters of a string at odd index  

Input: HelloWorld  
Output: elWrd  

Explaination:  Helloworld 
               0123456789
 */

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr="";

        for(int i=0;i<str.length();i++){
            if(i%2 != 0){
                newStr += str.charAt(i);
            }
        }

        System.out.println(newStr);
        sc.close();
        
    }
}

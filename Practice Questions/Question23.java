/*
Reverse the String  

Input: Hello How Are You  
Output: uoY erA woH olleH
*/

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();

        //m-1
        for(int i=str.length() -1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        
        //m-2
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);

        sc.close();
    }
}

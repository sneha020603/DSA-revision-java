/*
Find the first letter of each word in a string  

Input: Hello How Are You  
Output: HHAY
*/

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String newStr="";

        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            newStr += arr[i].charAt(0);
        }
        System.out.println(newStr);
        sc.close();
    }
}

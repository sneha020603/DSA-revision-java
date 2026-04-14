/*
Find the last letter of each word in a string  

Input:  Hello How Are You  
Output:  oweu
*/

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        String newStr ="";
        for(String st:arr){
            int n = st.length();
            newStr += st.charAt(n-1);
        }

        System.out.println(newStr);
        sc.close();
    }
}

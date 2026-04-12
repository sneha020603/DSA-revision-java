/*
Count the number of words in a String  

Input: Welcome to My World of Programming  
Output: The Number of Words are:6  

Explaination: Welcome, to,My,Wprld,of,Programming
*/

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;

        for(char c:str.toCharArray()){
            if(c == ' '){
                count++;
            }
        }

        //M-2
        String[] arr = str.split(" ");
        int word =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != " "){
                word++;
            }
        }

        System.out.println("The Number of Words are:"+(count));
        System.out.println("The Number of Words are:"+(word));
        sc.close();
        
    }
}

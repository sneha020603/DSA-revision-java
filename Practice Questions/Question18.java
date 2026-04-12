/*
Write a program to compute the number of spaces and characters in string. 

Input : Hi I am a Student 
Output : 4 13
*/

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int Char =0;
        int sp =0;
        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                Char++;
            }else if(c == ' '){
                sp++;
            }
        }

        System.out.println(Char+" "+sp);
        sc.close();
    }
}

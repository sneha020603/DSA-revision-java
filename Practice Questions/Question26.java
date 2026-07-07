/*
Count the Number of vowels, consonent and digit into a string  

Input: Welcome1234  
Output: 
Number of Vowels:3 
Number of Consonents:4 
Number of Numbers:4
*/

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int vCount = 0, cCount = 0, dCount = 0;
        for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
                dCount++;
            }else if(Character.isLetter(c)){
                String vowels = "aeiouAEIOU";
                if(vowels.indexOf(c) != -1){
                    vCount++;
                }else{
                    cCount++;
                }
            }
        }

        System.out.println("Number of Vowels:" + vCount);
        System.out.println("Number of Consonents:" + cCount);   
        System.out.println("Number of Numbers:" + dCount);
        sc.close();
    }
}

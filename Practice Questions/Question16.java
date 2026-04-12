/*
Count the no. of Lowercase letters in a String and print the count.
*/

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;
        for(char c:str.toCharArray()){
            if(Character.isLowerCase(c)){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

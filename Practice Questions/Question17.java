/*
WAP to print non repeated letters from string
*/

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String newStr="";
        for(char c:str.toCharArray()){
            if(newStr.indexOf(c) == -1){
                newStr += c;
            }
        }
        System.out.println(newStr);

        sc.close();
    }
}

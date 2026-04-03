/*
Write a java code to Count the number of spaces and characters  

input: Hello world this is Java 
output : 
Spaces: 4 
Characters (excluding spaces): 20
*/

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        check(input);
        sc.close();
    }

    public static void check(String input){
        int space = 0;
        int chara = 0;

        if (input == null || input.trim().isEmpty()) {
            System.out.println("No String Found");
            return;
        }

        for(char ch : input.toCharArray()){
            if(ch == ' '){
                space++;
            }else{
                chara++;
            }
        }

        System.out.println("Space: "+space);
        System.out.println("Characters (excluding spaces): "+chara);

    }
}

/*
Write a java code Remove duplicate characters in a string 

input: hello hey guys 
output : helo y gus
*/

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        check(input);
        sc.close();
    }

    public static void check(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("");
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1 || ch == ' ') {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

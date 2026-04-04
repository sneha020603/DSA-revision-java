/*
Write a java code to Print the last character of every word in a string  

* Input : Hello world this is Java 
* Output : o d s s a
*/

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // You can replace this with any input string

        if (input == null || input.trim().isEmpty()) {
            System.out.println("No String found");
        }

        String[] words = input.trim().split("\\s+");

        for (String word : words) {
            if (word.length() > 0) {
                System.out.print(word.charAt(word.length() - 1)+" ");
            }
        }

        sc.close();
    }
}


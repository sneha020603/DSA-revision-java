/*
Write a javą code to Find the Largest word in a string

* Input : Java programming is awesome 
* Output : programming
*/

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input == null || input.trim().isEmpty()) {
            System.out.println("No String found");
        }

        String[] words = input.trim().split("\\s+");
        String longest = "";
        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }

        System.out.println(longest);
        sc.close();
    }
}
